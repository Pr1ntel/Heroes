package com.company;
public class Gremlin extends Unit {

    public Gremlin(int hp, int damage, String name, int defense, int stepForMap) {
        super(hp, damage, name, defense, stepForMap);
    }

    private BattlefieldMap battlefieldMap;

    public Gremlin(int hp, int damage, String name, int defense, int stepForMap, BattlefieldMap.FieldCell fieldCell) {
        super(hp, damage, name, defense, stepForMap);
        this.battlefieldMap = battlefieldMap;
    }

    @Override
    public boolean Attack(Unit unit) {

        return false;
    }

    @Override
    public String getAsString() {
        return null;
    }
}