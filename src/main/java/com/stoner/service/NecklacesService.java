package com.stoner.service;

import com.stoner.dao.StorageFactory;
import com.stoner.dao.StorageFile;
import com.stoner.entity.Necklaces;

public class NecklacesService implements CRUDService {
    private final static StorageFactory STORAGE_FACTORY = configure();

    private static StorageFactory configure(){
        if (true){
            return new StorageFile();
        }
        return new StorageFile();
    }

    public void save(Necklaces necklaces) {
        STORAGE_FACTORY.saveStonesTo(necklaces);
    }

    public Necklaces[] findAll() {
        return STORAGE_FACTORY.readStonesFrom();
    }
}

/*
*
* Factory method for DAO
* JavaDocs
* JUnit
* */
