package com.company;

public class Archer extends Unit {

    private int countArrows;

    private BattlefieldMap battlefieldMap;

    public Archer(int hp, int damage, String name, int defense, int stepForMap, int countArrows, BattlefieldMap.FieldCell fieldCell) {
        super(hp, damage, name, defense, stepForMap);
        this.battlefieldMap = battlefieldMap;
        this.countArrows = countArrows;
    }

    public int getCountArrows() {
        return countArrows;
    }

    public void setCountArrows(int countArrows) {
        this.countArrows = countArrows;
    }

    @Override
    public boolean Attack(Unit unit) {
        unit.setHp(unit.getHp() - this.getDamage());
        countArrows--;
        return false;
    }

    @Override
    public String getAsString() {
        return "{" +
                "hp=" + getHp() +
                ", damage=" + getDamage() +
                ", name='" + getName() + '\'' +
                ", countArrows=" + countArrows +
                '}';
    }
}