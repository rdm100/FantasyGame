package room;

import behaviours.IRoom;

public abstract class Monster implements IRoom {
    private String name;
    private int attackValue;
    private int healthPoints;

    public Monster(String name, int attackValue, int healthPoints) {
        this.name = name;
        this.attackValue = attackValue;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
