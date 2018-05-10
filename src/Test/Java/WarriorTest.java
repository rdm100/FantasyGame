import org.junit.Before;
import org.junit.Test;
import player.Warrior;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void setUp() throws Exception {
        warrior = new Warrior("Tam", 100);
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
}
