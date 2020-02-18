package com.stoner.util;

import com.stoner.entity.Color;
import com.stoner.entity.Stone;
import com.stoner.entity.Transparency;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.IntStream;

public class StoneFactory {

    public static final Random RANDOM = new Random();

    private static Stone[] stones;

    private final static String[] NAMES = {
            "gemstone.diamond.name",
            "gemstone.sapphire.name",
            "gemstone.ruby.name",
            "gemstone.emerald.name",
            "gemstone.topaz.name",
            "semiprecious.jade.name",
            "semiprecious.malachite.name",
            "semiprecious.amber.name",
            "semiprecious.onyx.name",
            "semiprecious.aquamarine.name"
    };

    private final static String[] TYPES = {
            "gemstone.type",
            "semiprecious.type"
    };

    static {
        stones = new Stone[10];
        IntStream.range(0, stones.length).forEach(i -> stones[i] = getStone());
    }

    private static Stone getStone() {
        return new Stone(NAMES[RANDOM.nextInt(NAMES.length)], TYPES[RANDOM.nextInt(TYPES.length)], true,
                new BigDecimal(100), new BigDecimal(10), Transparency.EXCELLENT, Color.WHITE);
    }

    public static Stone getRandomStone() {
        int index = RANDOM.nextInt(stones.length);
        return stones[index];
    }
}
