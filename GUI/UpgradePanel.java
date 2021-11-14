package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Core.Player;

public class UpgradePanel extends JPanel {

    private static UpgradeBox jumpHeightUpgradeBox;
    private static UpgradeBox maxHealthUpgradeBox;
    private static UpgradeBox moveSpeedUpgradeBox;

    public UpgradePanel() {

        jumpHeightUpgradeBox = new UpgradeBox("Jump Height");
        maxHealthUpgradeBox = new UpgradeBox("Max Health");
        moveSpeedUpgradeBox = new UpgradeBox("Move Speed");

        this.add(jumpHeightUpgradeBox);
        this.add(maxHealthUpgradeBox);
        this.add(moveSpeedUpgradeBox);

        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new GridLayout(0, 1));

        this.setVisible(true);
    }
}
