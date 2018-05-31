package com.company.ActionListener;

import com.company.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoPlayerButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
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
        Main.mainWindow.helloLabel.setVisible(false);

        Main.mainWindow.areaForAnswerField.setText(null);
        Main.mainWindow.count.setDefCount(2);
        Main.mainWindow.pointsOfFirstGamer.setText(null);
        Main.mainWindow.pointsOfSecondGamer.setText(null);
        Main.mainWindow.yourCityOnWord.setText("Введите город:");
        Main.mainWindow.yourTurn.setText(null);
        Main.mainWindow.logOfCityText.setText(null);
        Main.mainWindow.nickNameFirstPlayerField.setText(null);
        Main.mainWindow.nickNameSecondPlayerField.setText(null);
    }
}