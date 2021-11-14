import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player {
    
    private double x; // x-coordinate of the player
    private double y; // y-coordinate of the player
    
    private BufferedImage player; // This can be changed to whatever Type the player sprite is

    public Player(double x, double y, Main game) {
        this.x = x;
        this.y = y;
    }

    public void update() { // Update method

    }

    public void render(Graphics g) { // Render method
        g.drawImage(player, (int)x, (int)y, null); // Draws the player sprite at its new coordinates
    }
}
