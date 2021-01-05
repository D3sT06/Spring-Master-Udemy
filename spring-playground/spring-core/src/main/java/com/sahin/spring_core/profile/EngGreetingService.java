package com.sahin.spring_core.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "eng"})
public class EngGreetingService implements GreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
