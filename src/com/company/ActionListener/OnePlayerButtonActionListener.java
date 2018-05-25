package com.company.ActionListener;

import com.company.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnePlayerButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.onePlayerButton.setVisible(false);
        Main.mainWindow.twoPlayerButton.setVisible(false);
        Main.mainWindow.rulesButton.setVisible(false);
        Main.mainWindow.backButton.setVisible(true);
        Main.mainWindow.exitFromRulesAndGameButton.setVisible(true);
        Main.mainWindow.exitFromMainMenuButton.setVisible(false);
        Main.mainWindow.acceptAnswerButton.setVisible(true);
        Main.mainWindow.logOfCityText.setVisible(true);
        Main.mainWindow.areaForAnswerField.setVisible(true);
        Main.mainWindow.logOfCityLabel.setVisible(true);
        Main.mainWindow.helloLabel.setVisible(false);
        Main.mainWindow.turnOfEndLabel.setVisible(true);
        Main.mainWindow.yourTurn.setVisible(true);
        Main.mainWindow.yourCityOnWord.setVisible(true);
        Main.mainWindow.pointsOfFirstGamer.setVisible(true);
        Main.mainWindow.pointsOfSecondGamer.setVisible(true);

    }
}
