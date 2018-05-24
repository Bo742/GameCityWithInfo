package com.company;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.OnePlayerButton.setVisible(true);
        Main.mainWindow.TwoPlayerButton.setVisible(true);
        Main.mainWindow.RulesButton.setVisible(true);
        Main.mainWindow.BackButton.setVisible(false);
        Main.mainWindow.ExitFromRulesAndGameButton.setVisible(false);
        Main.mainWindow.ExitFromMainMenuButton.setVisible(true);
        Main.mainWindow.AcceptAnswerButton.setVisible(false);
        Main.mainWindow.AcceptNickNameButton.setVisible(false);
        Main.mainWindow.RulesText.setVisible(false);
        Main.mainWindow.LogOfCityText.setVisible(false);
        Main.mainWindow.YourTurn.setVisible(false);
        Main.mainWindow.NickNameFirstPlayerField.setVisible(false);
        Main.mainWindow.NickNameSecondPlayerField.setVisible(false);
        Main.mainWindow.AreaForAnswerField.setVisible(false);
        Main.mainWindow.LogOfCityLabel.setVisible(false);
        Main.mainWindow.HelloLabel.setVisible(true);
        Main.mainWindow.NickNameOneLabel.setVisible(false);
        Main.mainWindow.NickNameTwoLabel.setVisible(false);
        Main.mainWindow.TurnOfEndLabel.setVisible(false);

    }
}
