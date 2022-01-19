package com.pinche.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供给我自己的小软件验证接口
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2022/1/4
 */
@RestController()
@RequestMapping("app")
public class MyAppController {
    private static final Logger LOG = LoggerFactory.getLogger(MyAppController.class);

    @PostMapping("login")
    public String login() {
        LOG.info("接受到login请求");
        return "26350A96511E23416783FDD4B1B7F7AC";
    }

    @PostMapping("time")
    public String postTime() {
        LOG.info("接受到postTime请求");
        return "9999-99-99 99:99:99";
    }

    @GetMapping("time")
    public String getTime() {
        LOG.info("接受到getTime请求");
        return JSON.parseObject("{\"api\":\"mtop.common.getTimestamp\",\"v\":\"*\",\"ret\":[\"SUCCESS::接口调用成功\"],\"data\":{\"t\":\"1642554471175\"}}").toJSONString();
    }
}
