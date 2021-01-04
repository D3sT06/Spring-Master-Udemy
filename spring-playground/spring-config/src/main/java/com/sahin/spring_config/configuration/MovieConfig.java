package com.sahin.spring_config.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {

    @Bean
    public MovieManager movieManager() {
        return new MovieManagerImpl();
    }
}
