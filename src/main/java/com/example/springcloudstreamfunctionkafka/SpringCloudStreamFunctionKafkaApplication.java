package com.example.springcloudstreamfunctionkafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.binding.BinderAwareChannelResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@Slf4j
public class SpringCloudStreamFunctionKafkaApplication {

    @Autowired
    private BinderAwareChannelResolver resolver;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamFunctionKafkaApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(PubSubSendQueue pubSubSendQueue) {
//        return args -> {
//            resolver.resolveDestination("fizbuzz")
//                    .send(MessageBuilder.withPayload("hello world").build());
//        };
//    }
}
