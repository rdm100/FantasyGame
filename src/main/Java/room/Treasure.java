package room;

import behaviours.IHold;
import behaviours.IBelongInRoom;

public abstract class Treasure implements IHold, IBelongInRoom {
    private String name;
    private int worth;

    public Treasure(String name, int worth) {
        this.name = name;
        this.worth = worth;
    }

    public String getName() {
        return name;
    }

    public int getWorth() {
        return worth;
    }


}
