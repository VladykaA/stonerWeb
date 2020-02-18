package com.stoner.dao;

import com.stoner.entity.Chain;

import java.io.*;
import java.util.Objects;

public class StorageFile extends StorageFactory {

    protected static final String FILE_NAME = "Stones.dat";

    static {
        save(new Chain[20]);
    }

    public static void save(Chain[] necklaces) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(necklaces);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveStonesTo(Chain necklace) {
        Chain[] necklaces = readStonesFrom();

        for (int i = 0; i < necklaces.length; i++) {
            if (Objects.isNull(necklaces[i])) {
                necklaces[i] = necklace;
            }
        }
        save(necklaces);
    }

    public Chain[] readStonesFrom() {

        Chain[] necklaces = new Chain[1];

        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);

            necklaces = (Chain[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return necklaces;
    }
}
