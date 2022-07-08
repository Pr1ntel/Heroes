public abstract class Unit {

    private int hp;
    private int damage;
    private String name;
    private int defense;
    private int stepForMap;

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

    public int getStopForMap() {
        return stepForMap;
    }

    public void setStopForMap(int stepForMap) {
        this.stepForMap = stepForMap;
    }

    public Unit(int hp, int damage, String name, int defense, int stepForMap) {
        this.hp = hp;
        this.damage = damage;
        this.name = name;
        this.defense = defense;
        this.stepForMap = stepForMap;
    }
}
