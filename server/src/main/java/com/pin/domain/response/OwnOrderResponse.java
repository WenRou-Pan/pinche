package com.pin.domain.response;

import com.pin.domain.order.OrderVO;

import java.util.List;

/**
 * 类OwnOrderResponse.java
 *
 * @author kaiwen.ykw 2018-12-31
 */
public class OwnOrderResponse extends BaseResponse {
    private List<OrderVO> orderList;

    public List<OrderVO> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderVO> orderList) {
        this.orderList = orderList;
    }
}
