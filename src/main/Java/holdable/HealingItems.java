package holdable;

import behaviours.IHold;

public abstract class HealingItems implements IHold {

    private String name;
    private int healValue;

    public HealingItems(String name, int healValue) {
        this.name = name;
        this.healValue = healValue;
    }

    public String getName() {
        return name;
    }

    public int getHealValue() {
        return healValue;
    }
}
