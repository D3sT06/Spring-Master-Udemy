package com.sahin.spring_config.bean_factory;

public class EngDictionaryService implements DictionaryService {

    private final DictionaryRepository repository;

    public EngDictionaryService(DictionaryRepository repository) {
        this.repository = repository;
    }

    @Override
    public DictionaryRepository getRepository() {
        return repository;
    }
}
