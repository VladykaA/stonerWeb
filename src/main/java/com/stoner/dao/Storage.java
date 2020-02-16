package com.stoner.dao;

import com.stoner.entity.Necklaces;

import java.io.*;
import java.util.Objects;

public class Storage {

    private static final String FILE_NAME = "Stones.dat";

    static {
        save(new Necklaces[20]);
    }

    private static void save(Necklaces[] necklaces) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(necklaces);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveStonesToFile(Necklaces necklace) {
        Necklaces[] necklaces = readFromFile();

        for (int i = 0; i < necklaces.length; i++) {
            if (Objects.isNull(necklaces[i])) {
                necklaces[i] = necklace;
            }
        }

        save(necklaces);
    }

    public Necklaces[] readFromFile() {

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
