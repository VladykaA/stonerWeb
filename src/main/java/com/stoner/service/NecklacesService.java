package com.stoner.service;

import com.stoner.dao.StorageFactory;
import com.stoner.dao.StorageFile;
import com.stoner.entity.Chain;

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
}

/*
*
* JavaDocs
* JUnit
* */
