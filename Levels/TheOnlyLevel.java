package Levels;

import javax.swing.JPanel;

import java.awt.*;
public class TheOnlyLevel extends JPanel {

    Image levelImage;

    private int[][] blocks = LevelArray.BLOCKS;
    
    public TheOnlyLevel() {

    }

    public void paintComponent(Graphics g) {
        if (levelImage == null) {
            levelImage = createImage(getSize().width, getSize().height);

            Graphics2D graphics2D = (Graphics2D) levelImage.getGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setPaint(Color.WHITE);
            graphics2D.fillRect(0, 0, getSize().width, getSize().height);
            graphics2D.setPaint(Color.BLACK);
            for (int i = 0; i < blocks.length; i++) {
                for (int j = 0; j < blocks[0].length; j++) {
                    if (blocks[i][j] == 1) {
                        graphics2D.fillRect(j * 10, i * 10, 10, 10);
                    }
                }
            }
            repaint();
        }
        g.drawImage(levelImage, 0, 0, null);
    }
}
