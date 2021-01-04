package com.sahin.spring_config.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MovieManagerTest {
    @Autowired
    private MovieManager movieManager;

    @Test
    void getMovie() {
        System.out.println(movieManager.getMovie());
    }
}