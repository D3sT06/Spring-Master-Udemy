package com.sahin.spring_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sahin.another_package", "com.sahin.spring_config"})
//@PropertySource("classpath:message.properties")
//@PropertySource("classpath:credential.properties")
@PropertySources({
        @PropertySource("classpath:message.properties"),
        @PropertySource("classpath:credential.properties")
})
public class SpringConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigApplication.class);
    }
}
