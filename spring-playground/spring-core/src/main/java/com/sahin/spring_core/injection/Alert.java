package com.sahin.spring_core.injection;

import org.springframework.stereotype.Component;

@Component
public class Alert {

    public String giveAlert() {
        return "Alert";
    }

}
