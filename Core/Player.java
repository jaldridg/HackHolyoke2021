package Core;

import java.awt.Graphics;

public class Player {

    private static Player player;
    
    private double x;
    private double y;
    private double vx;
    private double vy;
    
    private int jumpHeight;
    private int jumpHeightLevel;

    private int maxHealth;
    private int maxHealthLevel;

    private int moveSpeed;
    private int moveSpeedLevel;

    private int health;
    private int credits = 10;

    public Player(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Player(double x, double y, Main game) {

    }

    public static Player getPlayer() {
        if (player == null) {
            player = new Player(250, 250);
        }
        return player;
    }

    public void changeJumpHeight(int delta) {
        jumpHeight += delta;
    }

    public void changeJumpHeightLevel(int delta) {
        jumpHeightLevel += delta;
    }

    public void changeMaxHealth(int delta) {
        maxHealth += delta;
    }

    public void changeMaxHealthLevel(int delta) {
        maxHealthLevel += delta;
    }

    public void changeMoveSpeed(int delta) {
        moveSpeed += delta;
    }

    public void changeMoveSpeedLevel(int delta) {
        moveSpeedLevel += delta;
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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVX() {
        return vx;
    }

    public void setVX(double vx) {
        this.vx = vx;
    }

    public double getVY() {
        return vy;
    }

    public void setVY(double vy) {
        this.vy = vy;
    }
}
