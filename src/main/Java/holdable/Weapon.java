package holdable;

import behaviours.IHold;

public abstract class Weapon implements IHold {

    private String name;
    private int attackDamage;
    private int durability;

    public Weapon(String name, int attackDamage, int durability) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getDurability() {
        return durability;
    }

    public void addItemToHand(){

    }

    public void removeItemToHand(){

    }

    public void addItemFromKnapsack(){

    }

    public void removeItemFromKnapsack(){

    }
}
