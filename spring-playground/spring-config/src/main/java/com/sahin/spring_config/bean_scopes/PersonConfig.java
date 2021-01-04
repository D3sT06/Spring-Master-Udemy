package com.sahin.spring_config.bean_scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig {

    @Bean
    //@Scope("singleton")
        //@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    Person personSingleton() {
        return new Person();
    }

    @Bean
    @Scope("prototype")
        //@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Person personPrototype() {
        return new Person();
    }
}
