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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCarat() {
        return carat;
    }

    public void setCarat(BigDecimal carat) {
        this.carat = carat;
    }

    public Transparency getTransparency() {
        return transparency;
    }

    public void setTransparency(Transparency transparency) {
        this.transparency = transparency;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isGemstone() {
        return isGemstone;
    }

    public void setGemstone(boolean gemstone) {
        isGemstone = gemstone;
    }
}
