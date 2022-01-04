package com.pinche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2021/12/16
 */
@SpringBootApplication
@EnableCaching
@EnableAsync
@EnableWebSocket
public class PinApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinApplication.class, args);
    }

}

