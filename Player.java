import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player {
    
    private double x; // x-coordinate of the player
    private double y; // y-coordinate of the player
    
    private BufferedImage player;

    public Player(double x, double y, Main game) {
        this.x = x;
        this.y = y;
    }

    public void update() { // Update method

    }

    public void render(Graphics g) { // Render method
        g.drawImage(player, (int)x, (int)y, null);
    }
}
