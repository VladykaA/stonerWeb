package com.stoner.dao;

import com.stoner.entity.Chain;

public class StorageDB extends StorageFactory {

    @Override
    public void saveStonesTo(Chain necklace) {

    }

    @Override
    public Chain[] readStonesFrom() {
        return new Chain[0];
    }
}
