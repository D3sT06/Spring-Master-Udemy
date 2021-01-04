package com.sahin.spring_core.primary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppServiceTest {

    @Autowired
    private AppService appService;

    @Test
    void getApp() {
        System.out.println(appService.getApp());
    }
}