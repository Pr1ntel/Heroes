package com.company;
public class orc extends Unit {

    public orc(int hp, int damage, String name, int defense, int stepForMap) {
        super(hp, damage, name, defense, stepForMap);
    }

    @Override
    public boolean Attack(Unit unit) {
        unit.setHp(unit.getHp() - this.getDamage());
        return false;
    }

    @Override
    public String getAsString() {
        return null;
    }
}