import java.awt.event.*;

import javax.swing.JComponent;

public class Controller extends JComponent {

    private boolean isPressingW;
    private boolean isPressingA;
    private boolean isPressingS;
    private boolean isPressingD;

    public Controller() {
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) { 
                System.out.print(e.getKeyChar());
                if (e.getKeyChar() == 'w') {
                    isPressingW = true;
                    System.out.println('w');
                } else {
                    isPressingW = false;
                }
                if (e.getKeyChar() == 'W') {
                    isPressingW = true;
                    System.out.println('w');
                } else {
                    isPressingW = false;
                }
            }
        });
    }


}