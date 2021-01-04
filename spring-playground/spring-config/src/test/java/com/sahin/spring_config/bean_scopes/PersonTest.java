package com.sahin.spring_config.bean_scopes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonTest {

    @Autowired
    @Qualifier("personSingleton")
    private Person firstSingleton;

    @Autowired
    @Qualifier("personSingleton")
    private Person secondSingleton;

    @Autowired
    @Qualifier("personPrototype")
    private Person firstPrototype;

    @Autowired
    @Qualifier("personPrototype")
    private Person secondPrototype;

    @Test
    void givenSingletonScope_whenSetName_thenSameNames() {

        firstSingleton.setName("Joe");
        secondSingleton.setName("Marcus");

        assertAll(() -> {
            assertEquals(firstSingleton.getName(), "Marcus");
            assertEquals(secondSingleton.getName(), "Marcus");
        });
    }

    @Test
    void givenPrototypeScope_whenSetName_thenDifferentNames() {

        firstPrototype.setName("Joe");
        secondPrototype.setName("Marcus");

        assertAll(() -> {
            assertEquals(firstPrototype.getName(), "Joe");
            assertEquals(secondPrototype.getName(), "Marcus");
        });
    }
}