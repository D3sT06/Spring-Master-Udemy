package com.sahin.spring_config.bean_factory;

public class GerDictionaryService implements DictionaryService {

    private final DictionaryRepository repository;

    public GerDictionaryService(DictionaryRepository repository) {
        this.repository = repository;
    }

    @Override
    public DictionaryRepository getRepository() {
        return repository;
    }
}
