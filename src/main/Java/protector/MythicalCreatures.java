package protector;

import behaviours.IHold;

public abstract class MythicalCreatures{

    private String name;
    private int defenceValue;
    private int healthPoints;

    public MythicalCreatures(String name, int defenceValue, int healthPoints) {
        this.name = name;
        this.defenceValue = defenceValue;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getDefenceValue() {
        return defenceValue;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
