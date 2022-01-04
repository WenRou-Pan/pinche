package com.pinche.domain.response;

import com.pinche.domain.order.OrderVO;

/**
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2021/12/16
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
