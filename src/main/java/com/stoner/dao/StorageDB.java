package com.stoner.dao;

import com.stoner.entity.Necklaces;

public class StorageDB extends StorageFactory {

    @Override
    public void saveStonesTo(Necklaces necklace) {

    }

    @Override
    public Necklaces[] readStonesFrom() {
        return new Necklaces[0];
    }
}
