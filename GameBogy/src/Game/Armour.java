package Game;

public class Armour extends Item {
    private int defense;

    public Armour(String name, int defense) {
        super(name);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }
}
