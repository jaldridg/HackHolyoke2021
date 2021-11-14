import java.awt.Container;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends JComponent implements Runnable {

    private Image image;
    private Graphics2D graphics2D;
    private ArrayList<UpgradeBox> upgradeBoxes;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());
    }

    public Main() {
        upgradeBoxes = new ArrayList<UpgradeBox>();
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

        JPanel upgradesPanel = new JPanel();
        upgradesPanel.setBackground(Color.LIGHT_GRAY);
        upgradesPanel.setSize(new Dimension(200, upgradeBoxes.size() * 50));
        upgradesPanel.setLayout(new GridLayout(0, 1));

        UpgradeBox jumpHeightUpgradeBox = new UpgradeBox("Jump Height");
        upgradeBoxes.add(jumpHeightUpgradeBox);

        UpgradeBox healthUpgradeBox = new UpgradeBox("Health");
        upgradeBoxes.add(healthUpgradeBox);

        // Add upgrade boxes to upgrade panel
        for (int i = 0; i < upgradeBoxes.size(); i++) {
            upgradesPanel.add(upgradeBoxes.get(i));
        }
        

        content.add(upgradesPanel, BorderLayout.WEST);
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