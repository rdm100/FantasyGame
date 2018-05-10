package player;

import behaviours.IHold;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<IHold> hands;
    private ArrayList<IHold> knapsack;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.hands = new ArrayList<>();
        this.knapsack = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList getHands(){
       ArrayList copyHands = new ArrayList<>(hands);
        return copyHands;
    }

    public ArrayList getKnapsack(){
        ArrayList copyKnapsack = new ArrayList<>(knapsack);
        return copyKnapsack;
    }

}
