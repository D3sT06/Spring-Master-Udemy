package com.sahin.spring_core.primary;

import org.springframework.stereotype.Service;

@Service
public class AndroidAppService implements AppService {

    @Override
    public String getApp() {
        return "An android app";
    }
}
