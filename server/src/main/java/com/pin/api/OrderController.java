package com.pin.api;

import com.pin.domain.order.OrderVO;
import com.pin.domain.request.AdviceOrderRequest;
import com.pin.domain.request.OrderRequest;
import com.pin.domain.request.OwnOrderRequest;
import com.pin.domain.request.PartnerOrderRequest;
import com.pin.domain.request.PublishOrderRequest;
import com.pin.domain.response.AdviceResponse;
import com.pin.domain.response.FuzzyOrderResponse;
import com.pin.domain.response.OrderResponse;
import com.pin.service.CacheService;
import com.pin.service.OrderService;
import com.pin.domain.request.FuzzyOrderRequest;
import com.pin.domain.response.BaseResponse;
import com.pin.domain.response.OwnOrderResponse;
import com.pin.service.annotation.ParamCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 类TripController.java的实现描述：TODO
 *
 * @author kaiwen.ykw 2018-12-26
 */
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CacheService cacheService;

    @PostMapping("fuzzy")
    @ParamCheck
    public FuzzyOrderResponse fuzzy(@RequestBody @Validated FuzzyOrderRequest request, BindingResult bindingResult) {
        FuzzyOrderResponse response = new FuzzyOrderResponse();
        List<OrderVO> orderList = orderService.findOrderList(request);
        response.setSuccess(true);
        response.setOrderList(orderList);
        return response;
    }

    @PostMapping("own")
    @ParamCheck
    public OwnOrderResponse own(@RequestBody @Validated OwnOrderRequest request, BindingResult bindingResult) {
        OwnOrderResponse response = new OwnOrderResponse();
        List<OrderVO> orderList = orderService.findOwnOrderList(request.getToken());
        response.setOrderList(orderList);
        response.setSuccess(true);
        return response;
    }

    @PostMapping("publish")
    @ParamCheck
    public BaseResponse publish(@RequestBody @Validated PublishOrderRequest request, BindingResult bindingResult) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(orderService.publish(request));
        return response;
    }

    @PostMapping("query")
    @ParamCheck
    public OrderResponse query(@RequestBody @Validated OrderRequest request, BindingResult bindingResult) {
        OrderResponse response = new OrderResponse();
        Integer userId = cacheService.getUserId(request.getToken());
        response.setOrder(orderService.findOrder(request.getOrderId(), userId));
        response.setSuccess(true);
        return response;
    }

    @PostMapping("join")
    @ParamCheck
    public BaseResponse query(@RequestBody @Validated PartnerOrderRequest request, BindingResult bindingResult) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(orderService.join(request));
        return response;
    }

    @PostMapping("cancel")
    @ParamCheck
    public BaseResponse cancel(@RequestBody @Validated PartnerOrderRequest request, BindingResult bindingResult) {
        BaseResponse response = new BaseResponse();
        orderService.cancel(request);
        response.setSuccess(true);
        return response;
    }
    @PostMapping("advice")
    @ParamCheck
    public AdviceResponse advice(@RequestBody @Validated AdviceOrderRequest request, BindingResult bindingResult) {
        AdviceResponse response = new AdviceResponse();
        response.setAdviceList(orderService.adviceOrderS(request));
        response.setSuccess(true);
        return response;
    }
}
