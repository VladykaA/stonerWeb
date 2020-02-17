package com.stoner.dao;

import com.stoner.entity.Necklaces;

import java.io.*;
import java.util.Objects;

public class StorageFile extends StorageFactory {

    protected static final String FILE_NAME = "Stones.dat";

    static {
        save(new Necklaces[20]);
    }

    public static void save(Necklaces[] necklaces) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(necklaces);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveStonesTo(Necklaces necklace) {
        Necklaces[] necklaces = readStonesFrom();

        for (int i = 0; i < necklaces.length; i++) {
            if (Objects.isNull(necklaces[i])) {
                necklaces[i] = necklace;
            }
        }
        save(necklaces);
    }

    public Necklaces[] readStonesFrom() {

        Necklaces[] necklaces = new Necklaces[1];

        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);

            necklaces = (Necklaces[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return necklaces;
    }
}
