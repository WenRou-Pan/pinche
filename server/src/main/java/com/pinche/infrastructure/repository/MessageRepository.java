package com.pinche.infrastructure.repository;

import com.pinche.domain.chat.MessageDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2021/12/16
 */
@Mapper
public interface MessageRepository {
    /**
     * 增加Message
     *
     * @param messageDO
     * @return
     */
    Integer inert(@Param("messageDO") MessageDO messageDO);

    /**
     * 查询是否有message
     *
     * @param orderId
     * @return
     */
    Integer findExist(@Param("orderId") Integer orderId);

    /**
     * 查询所有message
     *
     * @param orderId
     * @return
     */
    List<MessageDO> queryAll(@Param("orderId") Integer orderId);
}
