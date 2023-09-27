package com.demo.swr.cachetest;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class StringGenerator {

    public String buildSimpleString() {
        return UUID.randomUUID().toString();
    }

    @Cacheable("cached-string")
    public String buildeCachedString() {
        return UUID.randomUUID().toString();
    }
}
