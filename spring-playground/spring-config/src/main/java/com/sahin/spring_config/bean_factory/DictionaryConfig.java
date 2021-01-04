package com.sahin.spring_config.bean_factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class DictionaryConfig {

    @Bean
    public DictionaryServiceFactory dictionaryServiceFactory(DictionaryRepository repository) {
        return new DictionaryServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "eng"})
    public DictionaryService engDictionaryService(DictionaryServiceFactory factory) {
        return factory.getService(DictionaryType.ENG);
    }

    @Bean
    @Profile("esp")
    public DictionaryService espDictionaryService(DictionaryServiceFactory factory) {
        return factory.getService(DictionaryType.ESP);
    }

    @Bean
    @Profile("ger")
    public DictionaryService gerDictionaryService(DictionaryServiceFactory factory) {
        return factory.getService(DictionaryType.GER);
    }
}
