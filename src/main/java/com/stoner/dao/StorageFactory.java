package com.stoner.dao;

import com.stoner.entity.Chain;

public abstract class StorageFactory {

    public abstract void saveStonesTo(Chain necklace);

    public abstract Chain[] readStonesFrom();
}
