package Levels;

import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;

public class TheOnlyLevel extends JComponent {
    
    public TheOnlyLevel() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

            }
        });
    }

    public void paintComponent(Graphics g) {

    }
}
