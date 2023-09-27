package com.demo.swr.cachetest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

@Component
public class TimeLoop {

    @Autowired
    StringGenerator stringGenerator;


    @PostConstruct
    void init() {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                String simple = stringGenerator.buildSimpleString();
                String cached = stringGenerator.buildeCachedString();

                System.out.println("simple: " + simple + ", cached " + cached);
            }
        }, 2000l, 2000l);
    }
}
