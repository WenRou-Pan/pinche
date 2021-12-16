package com.yangkw.pin.domain.response;

import com.yangkw.pin.domain.order.OrderVO;

import java.util.List;

/**
 * 类FuzzyOrderResponse.java的实现描述：TODO
 *
 * @author kaiwen.ykw 2018-12-26
 */
public class FuzzyOrderResponse extends BaseResponse {
    private List<OrderVO> orderList;

    public List<OrderVO> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderVO> orderList) {
        this.orderList = orderList;
    }
}
