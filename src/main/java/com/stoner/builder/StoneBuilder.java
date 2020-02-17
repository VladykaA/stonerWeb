package com.stoner.builder;

import com.stoner.entity.Color;
import com.stoner.entity.Stone;
import com.stoner.entity.Transparency;

import java.math.BigDecimal;

public class StoneBuilder implements Builder{
    private String name;
    private BigDecimal price;
    private BigDecimal carat;
    private Transparency transparency;
    private Color color;
    private boolean isGemstone;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void setCarat(BigDecimal carat) {
        this.carat = carat;
    }

    @Override
    public void setTransparency(Transparency transparency) {
        this.transparency = transparency;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setIsGemstone(boolean isGemstone) {
        this.isGemstone = isGemstone;
    }

    public Stone buildStone(){
        return new Stone(name, price, carat, transparency, color, isGemstone);
    }
}
