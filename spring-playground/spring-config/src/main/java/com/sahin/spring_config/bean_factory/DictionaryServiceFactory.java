package com.sahin.spring_config.bean_factory;

public class DictionaryServiceFactory {

    private final DictionaryRepository repository;

    public DictionaryServiceFactory(DictionaryRepository repository) {
        this.repository = repository;
    }

    public DictionaryService getService(DictionaryType type) {
        switch (type) {
            case ENG:
                return new EngDictionaryService(repository);
            case ESP:
                return new EspDictionaryService(repository);
            case GER:
                return new GerDictionaryService(repository);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
