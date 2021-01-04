package com.sahin.spring_config.bean_factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DictionaryServiceTest {

    @Autowired
    private DictionaryService dictionaryService;

    @Test
    void getService() {
        System.out.println(dictionaryService.getClass().getSimpleName());
    }
}