package GUI;

import javax.swing.*;

import Core.Player;

import java.awt.event.*;
import java.awt.*;

public class UpgradeBox extends JPanel {
    // Buy panel components
    private JLabel upgradeLabel;
    private JButton addButton; 
    private JButton subButton; // sub meaning subtract

    // Stats panel components
    private JLabel levelLabel;

    private int currentLevel = 1;

    private Player player = Player.getPlayer();

    MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getSource() == addButton) {
                if (player.getCredits() > 0) {
                    upgrade();
                }
            }
            if (e.getSource() == subButton) {
                downgrade();
            }
        }
    };

    public UpgradeBox(String upgradeName) {
        // Buy Panel
        JPanel buyPanel = new JPanel();

        upgradeLabel = new JLabel(upgradeName);

        addButton = new JButton("+");
        addButton.addMouseListener(mouseListener);
        subButton = new JButton("-");
        subButton.addMouseListener(mouseListener);

        subButton.setVisible(false);

        buyPanel.add(subButton);
        buyPanel.add(upgradeLabel);
        buyPanel.add(addButton);

        this.add(buyPanel);


        // Stats Panel
        JPanel statsPanel = new JPanel();

        levelLabel = new JLabel("Level: " + currentLevel);

        statsPanel.add(levelLabel);

        this.add(statsPanel);

        // Spacer Panel
        JPanel spacerPanel = new JPanel();

        this.add(spacerPanel);

        this.setLayout(new GridLayout(0, 1));
        this.setVisible(true);
    }

    private void upgrade() {
        currentLevel++;
        player.changeCredits(-1);
        levelLabel.setText("Level " + currentLevel);
        if (currentLevel > 1) {
            subButton.setVisible(true);
        }
    }

    private void downgrade() {
        currentLevel--;
        player.changeCredits(1);
        levelLabel.setText("Level " + currentLevel);
        if (currentLevel == 1) {
            subButton.setVisible(false);
        }
    }
}
