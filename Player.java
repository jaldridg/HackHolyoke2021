import java.util.ArrayList;

public class Player {
    
    private double x; // x-coordinate of the player
    private double y; // y-coordinate of the player

    private int jumpHeight;
    private int maxHealth;
    private int moveSpeed;

    private int health;
    private int credits;
    
    /*
    * Index 0: Jump Height
    * Index 1: Max Health
    * Index 2: Move Speed
    */
    private ArrayList<Integer> upgradeLevels;

    public Player(double x, double y) {
        this.x = x;
        this.y = y;
        upgradeLevels = new ArrayList<Integer>();
    }

    public void changeJumpHeight(int delta) {
        jumpHeight += delta;
    }

    public void changeMaxHealth(int delta) {
        maxHealth += delta;
    }

    public void changeMoveSpeed(int delta) {
        moveSpeed += delta;
    }

    
    public void changeHealth(int delta) {
        health += delta;
    }
    
    public int getCredits() {
        return credits;
    }

    public void changeCredits(int delta) {
        credits += delta;
    }
}
