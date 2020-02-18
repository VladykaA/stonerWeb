package com.stoner.service;

import com.stoner.dao.StorageFactory;
import com.stoner.dao.StorageFile;
import com.stoner.entity.Chain;

import java.util.Locale;
import java.util.ResourceBundle;

public class NecklacesService implements CRUDService {
    private final static StorageFactory STORAGE_FACTORY = configure();

    private static StorageFactory configure(){
        if (true){
            return new StorageFile();
        }
        return new StorageFile();
    }

    public void save(Chain chain) {
        STORAGE_FACTORY.saveStonesTo(chain);
    }

    public Chain[] findAll() {
        return STORAGE_FACTORY.readStonesFrom();
    }

    Locale[] supportedLocales = {
            Locale.ENGLISH,
            Locale.forLanguageTag("ua")
    };

    ResourceBundle labels = ResourceBundle.getBundle("LabelsBundle_en");


}

/*
*
* JavaDocs
* JUnit
* */
