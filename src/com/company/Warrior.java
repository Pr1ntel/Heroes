package com.company;
public class Warrior extends Unit {

    private int defence;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public Warrior(int hp, int damage, String name, int defense, int stepForMap) {
        super(hp, damage, name, defense, stepForMap);
    }

    @Override
    public boolean Attack(Unit unit) {
        unit.setHp(unit.getHp() - (this.getDamage() + this.getDefense()));
        defence--;
        return false;
    }

    @Override
    public String getAsString() {
        return "{" +
                "hp=" + getHp() +
                ", damage=" + getDamage() +
                ", name='" + getName() + '\'' +
                ", defence=" + getDefense() +
                '}';
    }
}
