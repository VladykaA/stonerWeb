package com.stoner.service;

import com.stoner.dao.Storage;
import com.stoner.entity.Necklaces;

public class NecklacesService implements CRUDService {
    private final static Storage STORAGE = new Storage();

    public void save(Necklaces necklaces) {
        STORAGE.saveStonesToFile(necklaces);
    }

    public Necklaces[] findAll() {
        return STORAGE.readFromFile();
    }
}

/*
* Builder for Stone distinct package
* Factory method for DAO
* JavaDocs
* JUnit
* */
