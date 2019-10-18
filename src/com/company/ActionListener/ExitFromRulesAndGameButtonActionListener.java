package com.company.ActionListener;

import com.company.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitFromRulesAndGameButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.twoPlayerButton.setVisible(true);
        Main.mainWindow.rulesButton.setVisible(true);
        Main.mainWindow.backButton.setVisible(false);
        Main.mainWindow.exitFromRulesAndGameButton.setVisible(false);
        Main.mainWindow.exitFromMainMenuButton.setVisible(true);
        Main.mainWindow.acceptNickNameButton.setVisible(false);
        Main.mainWindow.nickNameFirstPlayerField.setVisible(false);
        Main.mainWindow.nickNameSecondPlayerField.setVisible(false);
        Main.mainWindow.nickNameOneLabel.setVisible(false);
        Main.mainWindow.nickNameTwoLabel.setVisible(false);
        Main.mainWindow.helloLabel.setVisible(false);
        Main.mainWindow.rulesText.setVisible(false);

    }
}
