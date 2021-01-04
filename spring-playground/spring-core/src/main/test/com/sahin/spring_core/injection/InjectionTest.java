package com.sahin.spring_core.injection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InjectionTest {

    @Autowired
    private FieldInjectedComponent fieldInjectedComponent;

    @Autowired
    private SetterInjectedComponent setterInjectedComponent;

    @Autowired
    private ConstructorInjectedComponent constructorInjectedComponent;

    @Test
    void printAlert() {
        fieldInjectedComponent.printGreeting();
        setterInjectedComponent.printGreeting();
        constructorInjectedComponent.printAlert();
    }
}