package com.yangkw.pin.domain.response;

import com.yangkw.pin.domain.order.OrderVO;

/**
 * 类OrderResponse.java
 *
 * @author kaiwen.ykw 2018-12-30
 */
public class OrderResponse extends BaseResponse {
    private OrderVO order;

    public OrderVO getOrder() {
        return order;
    }

    public void setOrder(OrderVO order) {
        this.order = order;
    }
}
