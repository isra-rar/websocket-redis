package com.demo.swr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringWebsocketRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebsocketRedisApplication.class, args);
    }

}
