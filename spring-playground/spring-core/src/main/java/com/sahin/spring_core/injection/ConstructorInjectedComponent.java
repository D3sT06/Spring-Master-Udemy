package com.sahin.spring_core.injection;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedComponent {

    private final Alert alert;

    public ConstructorInjectedComponent(Alert alert) {
        this.alert = alert;
    }

    public void printAlert() {
        System.out.println(alert.giveAlert() + " from constructor injected component");
    }
}
