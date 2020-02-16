package com.stoner.entity;

import java.io.Serializable;

public class Necklaces implements Serializable {
    private Stone[] stones;

    public Necklaces() {
        stones = new Stone[10];
    }

    public void addStone(Stone stone) {

        resize();

        for (int i = 0; i < stones.length; i++) {
            if (stones[i] == null) {
                stones[i] = stone;
                break;
            }
        }
    }

    private void resize() {
        if (stones[stones.length - 1] != null) {
            Stone[] temp = new Stone[stones.length * 2];

            for (int i = 0; i < stones.length; i++) {
                temp[i] = stones[i];
            }

            stones = temp;
        }
    }
}

