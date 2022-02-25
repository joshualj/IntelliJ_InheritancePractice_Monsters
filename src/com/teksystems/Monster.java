package com.teksystems;

public class Monster {
    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    String attack() {
        return "tackle";
    }
}
