package com.sahin.spring_config.multiple_packages;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarServiceTest {

    @Autowired
    private CarService carService;

    @Test
    void getBrandName() {
        carService.setBrandName("Audi");
        System.out.println(carService.getBrandName());
    }
}