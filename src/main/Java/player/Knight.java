package player;

public class Knight extends Player{
    private int armourPoints;

    public Knight(String name, int healthPoints, int armourPoints) {
        super(name, healthPoints);
        this.armourPoints = armourPoints;
    }

    public int getArmourPoints() {
        return armourPoints;
    }
}
