package Game;

import java.util.ArrayList;

public class Hero {
    private String name;
    private String heroClass;
    private ArrayList<Weapon> weapons;
    private ArrayList<Armour> armours;
    private ArrayList<Potion> potions;
    private ArrayList<Item> bag;

    public Hero(String name, String heroClass) {
        this.name = name;
        this.heroClass = heroClass;
        this.weapons = new ArrayList<>();
        this.armours = new ArrayList<>();
        this.potions = new ArrayList<>();
        this.bag = new ArrayList<>();
    }

    public void equipItem(Item item) throws Exception {
        if (item instanceof Weapon && weapons.size() < 2) {
            weapons.add((Weapon) item);
        } else if (item instanceof Armour && armours.size() < 4) {
            armours.add((Armour) item);
        } else if (item instanceof Potion && potions.size() < 6) {
            potions.add((Potion) item);
        } else {
            throw new Exception("Item cannot be equipped. Equip limit reached.");
        }
    }

    public void pickUpItem(Item item) throws Exception {
        if (bag.size() < 6) {
            bag.add(item);
        } else {
            throw new Exception("Bag is full. Cannot pick up more items.");
        }
    }
}
