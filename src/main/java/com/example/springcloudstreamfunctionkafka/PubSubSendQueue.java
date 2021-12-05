package com.example.springcloudstreamfunctionkafka;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
class PubSubSendQueue {

    @Bean
    public Supplier<String> output() {
        return () -> "Adam";
    }
}