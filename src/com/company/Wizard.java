package com.company;

public class Wizard extends Unit {

    private int mana;

    private BattlefieldMap battlefieldMap;

    public Wizard(int hp, int damage, String name, int defence, int stepForMap, int mana, BattlefieldMap.FieldCell battlefieldMap) {
        super(hp, damage, name, defence, stepForMap);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public boolean Attack(Unit unit) {
        unit.setHp(unit.getHp() - this.getDamage());
        mana--;
        setStepForMap(1);
        return false;
    }

    @Override
    public String getAsString() {
        return "{" +
                "hp=" + getHp() +
                ", damage=" + getDamage() +
                ", name='" + getName() + '\'' +
                ", mana=" + mana +
                '}';
    }
}