package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcceptNickNameButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.OnePlayerButton.setVisible(false);
        Main.mainWindow.TwoPlayerButton.setVisible(false);
        Main.mainWindow.RulesButton.setVisible(false);
        Main.mainWindow.BackButton.setVisible(true);
        Main.mainWindow.ExitFromRulesAndGameButton.setVisible(true);
        Main.mainWindow.ExitFromMainMenuButton.setVisible(false);
        Main.mainWindow.AcceptAnswerButton.setVisible(true);
        Main.mainWindow.AcceptNickNameButton.setVisible(false);
        Main.mainWindow.RulesText.setVisible(false);
        Main.mainWindow.LogOfCityText.setVisible(true);
        Main.mainWindow.YourTurn.setVisible(true);
        Main.mainWindow.NickNameFirstPlayerField.setVisible(false);
        Main.mainWindow.NickNameSecondPlayerField.setVisible(false);
        Main.mainWindow.AreaForAnswerField.setVisible(true);
        Main.mainWindow.LogOfCityLabel.setVisible(true);
        Main.mainWindow.HelloLabel.setVisible(false);
        Main.mainWindow.NickNameOneLabel.setVisible(false);
        Main.mainWindow.NickNameTwoLabel.setVisible(false);
        Main.mainWindow.TurnOfEndLabel.setVisible(true);
    }
}