package com.pinche.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
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
    public String time() {
        LOG.info("接受到time请求");
        return "9999-99-99 99:99:99";
    }


}
