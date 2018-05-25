package com.company.ActionListener;

import com.company.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoPlayerButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.onePlayerButton.setVisible(false);
        Main.mainWindow.twoPlayerButton.setVisible(false);
        Main.mainWindow.rulesButton.setVisible(false);
        Main.mainWindow.backButton.setVisible(true);
        Main.mainWindow.exitFromRulesAndGameButton.setVisible(true);
        Main.mainWindow.exitFromMainMenuButton.setVisible(false);
        Main.mainWindow.acceptNickNameButton.setVisible(true);
        Main.mainWindow.nickNameFirstPlayerField.setVisible(true);
        Main.mainWindow.nickNameSecondPlayerField.setVisible(true);
        Main.mainWindow.nickNameOneLabel.setVisible(true);
        Main.mainWindow.nickNameTwoLabel.setVisible(true);


    }
}