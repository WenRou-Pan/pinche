package com.pinche.infrastructure.cache.impl;

import com.pinche.domain.address.Dot;
import com.pinche.infrastructure.cache.AbstractGeoCache;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2021/12/16
 */
@Component("start")
public class StartCacheImpl extends AbstractGeoCache {
    @Override
    public void add(Dot dot, Integer orderId, LocalDateTime targetTime) {
        super.add("start", dot, orderId, targetTime);
    }

    @Override
    public List<Integer> findOrderId(Dot dot) {
        return super.findOrderId(dot, "start");
    }
}
