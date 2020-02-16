package com.stoner.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Stone implements Serializable {
    private String name;
    private BigDecimal price;
    private BigDecimal carat;
    private Transparency transparency;
    private Color color;
    private boolean isGemstone;

    public Stone(String name, BigDecimal price, BigDecimal carat,
                 Transparency transparency, Color color, boolean isGemstone) {
        this.name = name;
        this.price = price;
        this.carat = carat;
        this.transparency = transparency;
        this.color = color;
        this.isGemstone = isGemstone;
    }
}
