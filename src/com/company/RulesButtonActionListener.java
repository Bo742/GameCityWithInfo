package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RulesButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.OnePlayerButton.setVisible(false);
        Main.mainWindow.TwoPlayerButton.setVisible(false);
        Main.mainWindow.RulesButton.setVisible(false);
        Main.mainWindow.BackButton.setVisible(true);
        Main.mainWindow.ExitFromRulesAndGameButton.setVisible(true);
        Main.mainWindow.ExitFromMainMenuButton.setVisible(false);
        Main.mainWindow.AcceptAnswerButton.setVisible(false);
        Main.mainWindow.AcceptNickNameButton.setVisible(false);
        Main.mainWindow.RulesText.setVisible(true);
        Main.mainWindow.LogOfCityText.setVisible(false);
        Main.mainWindow.YourTurn.setVisible(false);
        Main.mainWindow.NickNameFirstPlayerField.setVisible(false);
        Main.mainWindow.NickNameSecondPlayerField.setVisible(false);
        Main.mainWindow.AreaForAnswerField.setVisible(false);
        Main.mainWindow.LogOfCityLabel.setVisible(false);
        Main.mainWindow.HelloLabel.setVisible(false);
        Main.mainWindow.NickNameOneLabel.setVisible(false);
        Main.mainWindow.NickNameTwoLabel.setVisible(false);

    }
}
