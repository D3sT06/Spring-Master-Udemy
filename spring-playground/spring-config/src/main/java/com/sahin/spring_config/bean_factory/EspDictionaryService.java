package com.sahin.spring_config.bean_factory;

public class EspDictionaryService implements DictionaryService {

    private final DictionaryRepository repository;

    public EspDictionaryService(DictionaryRepository repository) {
        this.repository = repository;
    }

    @Override
    public DictionaryRepository getRepository() {
        return repository;
    }
}
