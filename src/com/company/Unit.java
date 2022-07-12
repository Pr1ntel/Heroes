package com.company;

public abstract class Unit {

    private int hp;

    public Unit(int hp, int damage, String name, int defense, int stepForMap) {
        this.hp = hp;
        this.damage = damage;
        this.name = name;
        this.defense = defense;
        this.stepForMap = stepForMap;
    }

    private int damage;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getStepForMap() {
        return stepForMap;
    }

    public void setStepForMap(int stepForMap) {
        this.stepForMap = stepForMap;
    }

    private String name;
    private int defense;
    private int stepForMap;

    public abstract boolean Attack(Unit unit);

    public abstract String getAsString();
}