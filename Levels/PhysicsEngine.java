
package Levels;

public class PhysicsEngine {
    
    private static final double GRAVITY = 9.8;

    private final int GROUND_LEVEL = 50;

    public void movePlayer() {

        preventPlayerIntersections();
    }
    
    /**
     * Doesn't let the player fall through the ground or walk through walls
     */
    private void preventPlayerIntersections() {

    }
}
