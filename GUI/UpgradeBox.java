package GUI;

import javax.swing.*;
import java.awt.event.*;

public class UpgradeBox extends JPanel {
    private JLabel upgradeLabel;
    private JButton addButton; 
    private JButton subButton; // sub meaning subtract
    private JLabel addCost;
    private JLabel subCost; // sub meaning subtract

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addButton) {

            }
            if (e.getSource() == subButton) {

            }
        }
    };

    public UpgradeBox(String upgradeName) {
        upgradeLabel = new JLabel(upgradeName);

        addButton = new JButton("+");
        addButton.addActionListener(actionListener);
        subButton = new JButton("-");
        subButton.addActionListener(actionListener);

        // TODO: The below labels should have upgrade costs on them
        addCost = new JLabel();
        subCost = new JLabel();

        this.add(subCost);
        this.add(subButton);
        this.add(upgradeLabel);
        this.add(addButton);
        this.add(addCost);

        this.setVisible(true);
    }
}
