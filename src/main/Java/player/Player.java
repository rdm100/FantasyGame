package player;

import behaviours.IDamage;
import behaviours.IHold;

import java.util.ArrayList;

public abstract class Player implements IDamage {

    private String name;
    private int healthPoints;
    private ArrayList<IHold> hands;
    private ArrayList<IHold> knapsack;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.hands = new ArrayList<IHold>();
        this.knapsack = new ArrayList<IHold>();
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

    public void takeDamage(int damage){
       healthPoints -= damage;
    }

    public void addItemToHand(IHold item){
        this.hands.add(item);
    }

    public int numberofItemsInHands(){
      return this.hands.size();
    }

    public void addItemToKnapsack(IHold item){
        this.knapsack.add(item);
    }

    public int numberofItemsInKnapsack(){
        return this.knapsack.size();
    }

    public IHold removeFromHand(IHold item){
       this.hands.remove(item);
       return item;
    }

    public IHold removeFromKnapsack(IHold item){
        this.knapsack.remove(item);
        return item;
    }

    public void passItemFromKnapsackToHand(IHold item){
//        this.removeFromKnapsack(item);
//        this.addItemToHand(item);
        this.knapsack.remove(item);
        this.hands.add(item);
    }

    public void passItemFromHandToKnapsack(IHold item) {
        this.hands.remove(item);
        this.knapsack.add(item);
    }
}
