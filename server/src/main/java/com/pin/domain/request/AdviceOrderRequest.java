package com.pin.domain.request;

import com.pin.domain.address.Dot;

/**
 * 类AdviceOrderRequest.java 的实现描述：
 *
 * @author kaiwen.ykw 2019-04-10
 */
public class AdviceOrderRequest extends BaseRequest{
    private Dot dot;

    public Dot getDot() {
        return dot;
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AdviceOrderRequest that = (AdviceOrderRequest) o;

        return dot != null ? dot.equals(that.dot) : that.dot == null;
    }

    @Override
    public int hashCode() {
        return dot != null ? dot.hashCode() : 0;
    }
}
