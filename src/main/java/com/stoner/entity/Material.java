package com.stoner.entity;

public abstract class Material {
    private String name;
    private String type;
    private boolean isGemstone;

    public Material(String name, String type, boolean isGemstone) {
        this.name = name;
        this.type = type;
        this.isGemstone = isGemstone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isGemstone() {
        return isGemstone;
    }

    public void setGemstone(boolean gemstone) {
        isGemstone = gemstone;
    }
}
