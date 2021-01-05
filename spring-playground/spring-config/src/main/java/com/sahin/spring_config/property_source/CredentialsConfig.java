package com.sahin.spring_config.property_source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CredentialsConfig {

    @Value("${sahin.username}")
    private String username;

    @Value("${sahin.password}")
    private String password;

    @Bean
    public Credentials credentials() {
        return new Credentials(username, password);
    }
}
