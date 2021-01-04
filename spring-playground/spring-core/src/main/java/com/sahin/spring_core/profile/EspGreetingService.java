package com.sahin.spring_core.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("esp")
public class EspGreetingService implements GreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hola Mundo!");
    }
}
