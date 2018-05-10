package holdable;

import behaviours.IHold;

public abstract class Spells implements IHold {
    private String name;
    private int attackDamage;

    public Spells(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

}
