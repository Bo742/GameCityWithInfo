package com.company.ActionListener;

import com.company.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RulesButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.onePlayerButton.setVisible(false);
        Main.mainWindow.twoPlayerButton.setVisible(false);
        Main.mainWindow.rulesButton.setVisible(false);
        Main.mainWindow.backButton.setVisible(true);
        Main.mainWindow.exitFromRulesAndGameButton.setVisible(true);
        Main.mainWindow.exitFromMainMenuButton.setVisible(false);
        Main.mainWindow.rulesText.setVisible(true);


    }
}
