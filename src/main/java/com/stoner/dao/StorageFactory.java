package com.stoner.dao;

import com.stoner.entity.Necklaces;

import java.io.*;
import java.util.Objects;

public abstract class StorageFactory {

    public abstract void saveStonesTo(Necklaces necklace);

    public abstract Necklaces[] readStonesFrom();
}
