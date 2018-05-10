import holdable.Sword;
import org.junit.Before;
import org.junit.Test;
import player.Warrior;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Sword sword;
    Warrior warrior;

    @Before
    public void setUp() throws Exception {
        warrior = new Warrior("Tam", 100);
        sword = new Sword("Excaliber", 10, 100);
    }

    @Test
    public void getName() {
        assertEquals("Tam", warrior.getName());
    }

    @Test
    public void gethealthPoints() {
        assertEquals(100, warrior.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        warrior.takeDamage(10);
        assertEquals(90, warrior.getHealthPoints());
    }

    @Test
    public void getNumberofItemsInHands() {
        warrior.addItemToHand(sword);
        assertEquals(1, warrior.numberofItemsInHands());
    }

    @Test
    public void canAddItemToHand() {
        warrior.addItemToHand(sword);
        assertEquals(1, warrior.numberofItemsInHands());
    }

    @Test
    public void canAddItemToKnapsack() {
        warrior.addItemToKnapsack(sword);
        assertEquals(1, warrior.numberofItemsInKnapsack());
    }

    @Test
    public void getNumberofItemsInKnapsack() {
        warrior.addItemToKnapsack(sword);
        assertEquals(1, warrior.numberofItemsInKnapsack());
    }

    @Test
    public void canRemoveFromHand(){
        warrior.addItemToHand(sword);
        warrior.removeFromHand(sword);
        assertEquals(0, warrior.numberofItemsInHands());
    }

    @Test
    public void canRemoveFromKnapsack(){
        warrior.addItemToKnapsack(sword);
        warrior.removeFromKnapsack(sword);
        assertEquals(0, warrior.numberofItemsInHands());
    }

    @Test
    public void canPassItemFromKnapsackToHand() {
        warrior.passItemFromKnapsackToHand(sword);
        assertEquals(1, warrior.numberofItemsInHands());
    }

    @Test
    public void canPassItemFromHandToKnapsack() {
        warrior.passItemFromHandToKnapsack(sword);
        assertEquals(1, warrior.numberofItemsInKnapsack());
    }

}
