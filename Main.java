import java.awt.Container;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import GUI.UpgradePanel;

public class Main extends JComponent implements Runnable {

    private Image image;
    private Graphics2D graphics2D;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());
    }

    public Main() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }
        });
    }

    public void run() {
        JFrame frame = new JFrame("Game");
        Container content = frame.getContentPane();

        content.setLayout(new BorderLayout());
        content.add(new Main(), BorderLayout.CENTER);

        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        UpgradePanel upgradePanel = new UpgradePanel();        

        content.add(upgradePanel, BorderLayout.WEST);
    }

    public void paintComponent(Graphics g) {
        if (image == null) {
            image = createImage(getSize().width, getSize().height);
            graphics2D = (Graphics2D) image.getGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setPaint(Color.white);
            graphics2D.fillRect(0, 0, getSize().width, getSize().height);
            repaint();
        }
        g.drawImage(image, 0, 0, null);
    }
}