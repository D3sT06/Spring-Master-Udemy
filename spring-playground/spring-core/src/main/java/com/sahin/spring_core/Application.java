package com.sahin.spring_core;

import com.sahin.spring_core.injection.Alert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class);

        Alert testAlert = (Alert) context.getBean("alert");
        System.out.println(testAlert.giveAlert());
    }
}
