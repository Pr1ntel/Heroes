public class Wizard extends Unit {                       //маг дальний бой

private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Wizard(int hp, int damage, String name, int defense, int stepForMap) {
        super(hp, damage, name, defense, stepForMap);

    }
}
