package com.company.ActionListener;

import com.company.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AcceptNickNameButtonActionListener implements ActionListener {
    public String nickNameFirstPlayer;

    @Override
    public void actionPerformed(ActionEvent e) {


        String s1=Main.mainWindow.nickNameFirstPlayerField.getText();
        String s2=Main.mainWindow.nickNameSecondPlayerField.getText();
        if (s1.isEmpty() || s2.isEmpty()){
            Main.mainWindow.helloLabel.setVisible(true);
            Main.mainWindow.helloLabel.setText("Введите имена игроков");
        }
        else{ Main.mainWindow.exitFromRulesAndGameButton.setVisible(true);
            Main.mainWindow.acceptAnswerButton.setVisible(true);
            Main.mainWindow.acceptNickNameButton.setVisible(false);
            Main.mainWindow.logOfCityText.setVisible(true);
            Main.mainWindow.yourTurn.setVisible(true);
            Main.mainWindow.nickNameFirstPlayerField.setVisible(false);
            Main.mainWindow.nickNameSecondPlayerField.setVisible(false);
            Main.mainWindow.areaForAnswerField.setVisible(true);
            Main.mainWindow.logOfCityLabel.setVisible(true);
            Main.mainWindow.nickNameOneLabel.setVisible(false);
            Main.mainWindow.nickNameTwoLabel.setVisible(false);
            Main.mainWindow.turnOfEndLabel.setVisible(true );
            Main.mainWindow.yourTurn.setVisible(true);
            Main.mainWindow.yourCityOnWord.setVisible(true);
            Main.mainWindow.pointsOfFirstGamer.setVisible(true);
            Main.mainWindow.pointsOfSecondGamer.setVisible(true);
            Main.mainWindow.helloLabel.setVisible(false);

            Main.mainWindow.pointsOfFirstGamer.setText("Очки игрока "+Main.mainWindow.nickNameFirstPlayerField.getText()+":0" );
            Main.mainWindow.pointsOfSecondGamer.setText("Очки игрока "+Main.mainWindow.nickNameSecondPlayerField.getText()+":0" );
            Main.mainWindow.yourTurn.setText("Ход игрока "+ Main.mainWindow.nickNameFirstPlayerField.getText());


        }



    }
}