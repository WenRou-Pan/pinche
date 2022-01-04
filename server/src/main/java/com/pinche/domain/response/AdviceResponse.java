package com.pinche.domain.response;

import com.pinche.domain.order.OrderVO;

import java.util.List;

/**
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2021/12/16
 */
public class AdviceResponse extends BaseResponse{
    private List<OrderVO> adviceList;

    public List<OrderVO> getAdviceList() {
        return adviceList;
    }

    public void setAdviceList(List<OrderVO> adviceList) {
        this.adviceList = adviceList;
    }
}
