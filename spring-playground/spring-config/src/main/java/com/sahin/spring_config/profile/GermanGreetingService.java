package com.sahin.spring_config.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ger")
public class GermanGreetingService implements GreetingService {
    @Value("${message.hello}")
    private String helloMessage;

    @Override
    public void sayHello() {
        System.out.println(helloMessage);
    }
}
