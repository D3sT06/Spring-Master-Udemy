package com.sahin.spring_config.property_source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Value("${message.url}")
    private String messageUrl;

    @Value("${message.port}")
    private int messagePort;

    @Bean
    public Message message() {
        return new Message(messageUrl, messagePort);
    }
}
