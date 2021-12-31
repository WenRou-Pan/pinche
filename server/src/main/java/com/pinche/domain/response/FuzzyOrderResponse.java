package com.pinche.domain.response;

import com.pinche.domain.order.OrderVO;

import java.util.List;

/**
 * @author Parmaze
 * @since 2021/12/16
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
