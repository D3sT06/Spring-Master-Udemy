package com.sahin.spring_core.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class IOSAppService implements AppService {

    @Override
    public String getApp() {
        return "An IOS App";
    }
}

