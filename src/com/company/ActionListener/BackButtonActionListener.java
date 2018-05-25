package com.company.ActionListener;


import com.company.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.onePlayerButton.setVisible(true);
        Main.mainWindow.twoPlayerButton.setVisible(true);
        Main.mainWindow.rulesButton.setVisible(true);
        Main.mainWindow.backButton.setVisible(false);
        Main.mainWindow.exitFromRulesAndGameButton.setVisible(false);
        Main.mainWindow.exitFromMainMenuButton.setVisible(true);
        Main.mainWindow.acceptAnswerButton.setVisible(false);
        Main.mainWindow.acceptNickNameButton.setVisible(false);
        Main.mainWindow.rulesText.setVisible(false);
        Main.mainWindow.logOfCityText.setVisible(false);
        Main.mainWindow.yourTurn.setVisible(false);
        Main.mainWindow.nickNameFirstPlayerField.setVisible(false);
        Main.mainWindow.nickNameSecondPlayerField.setVisible(false);
        Main.mainWindow.areaForAnswerField.setVisible(false);
        Main.mainWindow.logOfCityLabel.setVisible(false);
        Main.mainWindow.helloLabel.setVisible(true);
        Main.mainWindow.nickNameOneLabel.setVisible(false);
        Main.mainWindow.nickNameTwoLabel.setVisible(false);
        Main.mainWindow.turnOfEndLabel.setVisible(false);
        Main.mainWindow.yourTurn.setVisible(false);
        Main.mainWindow.yourCityOnWord.setVisible(false);
        Main.mainWindow.pointsOfFirstGamer.setVisible(false);
        Main.mainWindow.pointsOfSecondGamer.setVisible(false);

    }
}
