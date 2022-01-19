package com.pinche.test;

import com.alibaba.fastjson.JSON;

/**
 * @author PerMaze
 * @since 2022/1/19
 */
public class JSONTest {
    public static void main(String[] args) {
        String jsonStr = "{\"api\":\"mtop.common.getTimestamp\",\"v\":\"*\",\"ret\":[\"SUCCESS::接口调用成功\"],\"data\":{\"t\":\"1642554471175\"}}";
        System.out.println(JSON.parseObject(jsonStr).toJSONString());
    }
}
