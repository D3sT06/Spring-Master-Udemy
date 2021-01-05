package com.sahin.spring_config.property_source;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageTest {

    @Autowired
    private Message message;

    @Test
    public void printMessage() {
        System.out.println(message.getUrl());
        System.out.println(message.getPort());
    }
}