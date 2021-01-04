package com.sahin.spring_core.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedComponent {

    private Alert alert;

    @Autowired
    public void setAlert(Alert alert) {
        this.alert = alert;
    }

    public void printGreeting() {
        System.out.println(alert.giveAlert() + " from setter injected component");
    }
}