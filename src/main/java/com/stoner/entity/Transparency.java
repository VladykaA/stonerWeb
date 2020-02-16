package com.stoner.entity;

public enum Transparency {
    LOW(1, 25),
    WEAK(26,50),
    GOOD(51, 75),
    EXCELLENT(76, 100);

    private int valueFrom;
    private int valueTo;

    Transparency(int valueFrom, int valueTo) {
        this.valueFrom = valueFrom;
        this.valueTo = valueTo;
    }
}
