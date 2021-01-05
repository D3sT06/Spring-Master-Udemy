package com.sahin.spring_core.qualifier;

import org.springframework.stereotype.Service;

@Service
public class InjectionTestService implements TestService {

    @Override
    public void test() {
        System.out.println("injection test");
    }
}
