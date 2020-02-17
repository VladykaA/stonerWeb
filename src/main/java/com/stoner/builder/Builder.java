package com.stoner.builder;

import com.stoner.entity.Color;
import com.stoner.entity.Transparency;

import java.math.BigDecimal;

public interface Builder {
    void setName(String name);
    void setPrice(BigDecimal price);
    void setCarat(BigDecimal carat);
    void setTransparency(Transparency transparency);
    void setColor(Color color);
    void setIsGemstone(boolean isGemstone);
}
