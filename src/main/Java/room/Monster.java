package room;

import behaviours.IDamage;
import behaviours.IHold;
import behaviours.IBelongInRoom;

public abstract class Monster implements IBelongInRoom, IDamage {
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

    public void takeDamage(int damage){
        healthPoints -=  damage;
    }


}
