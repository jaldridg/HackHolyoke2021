
package Levels;

import Core.Player;

public class PhysicsEngine {
    
    private static final double GRAVITY = 9.8;

    private final int GROUND_LEVEL = 485;

    private int[][] blocks = LevelArray.BLOCKS;

    private Player player = Player.getPlayer();

    private boolean onGround = false;

    public void movePlayer() {
        if (!onGround) {
            moveByGravity();
        }
        // Calculate new coordinates
        player.setX(player.getX() + player.getVX());
        player.setY(player.getY() + player.getVY());

        // Make sure they don't break anything
        preventPlayerIntersections();
    }
    
    /**
     * Doesn't let the player fall through the ground or walk through walls
     */
    private void preventPlayerIntersections() {
        if (player.getY() > GROUND_LEVEL) {
            player.setY(GROUND_LEVEL);   
        }
    }

    private void moveByGravity() {
        player.setVY(player.getVY() + GRAVITY);
    }

}
