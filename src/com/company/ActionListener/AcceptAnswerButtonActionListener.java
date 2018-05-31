package com.company.ActionListener;

import com.company.LastLetter;
import com.company.Main;
import com.company.PopulationCity;
import com.company.SearchCity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcceptAnswerButtonActionListener implements ActionListener {
    public int pointsFirstPlayer = 0;
    public int pointsSecondPlayer = 0;
    public int c;

    @Override
    public void actionPerformed(ActionEvent e) {

            if (Main.mainWindow.areaForAnswerField.getText().isEmpty()) {
                Main.mainWindow.yourCityOnWord.setText("Введите город");
            } else {
                try {
                    String city = Main.mainWindow.areaForAnswerField.getText();
                    String arrayOfLogCity[] = Main.mainWindow.logOfCityText.getText().split("\n");
                    c=0;
                    for (int i = 0; i < arrayOfLogCity.length ; i++) {
                        if (Main.mainWindow.areaForAnswerField.getText().equals(arrayOfLogCity[i])) {
                            c = c+1;
                        }
                    }
                    if (Main.mainWindow.logOfCityText.getText().isEmpty()) {
                        SearchCity searchCity = new SearchCity(city);
                        PopulationCity populationCity = new PopulationCity(searchCity.getAllText());
                        pointsFirstPlayer = pointsFirstPlayer + populationCity.getPopulation();
                        Main.mainWindow.pointsOfFirstGamer.setText("Очки игрока " + Main.mainWindow.nickNameFirstPlayerField.getText() + ":" + pointsFirstPlayer);
                        Main.mainWindow.logOfCityText.setText(city + "\n" + Main.mainWindow.logOfCityText.getText());
                        Main.mainWindow.yourTurn.setText("Ход игрока " + Main.mainWindow.nickNameSecondPlayerField.getText());
                        Main.mainWindow.areaForAnswerField.setText(null);


                    } else {
                        LastLetter itsTrue = new LastLetter(arrayOfLogCity[0], city);
                    if (itsTrue.getFirstLetter().equals(itsTrue.getLastLetter()) && c==0) {
                            SearchCity searchCity = new SearchCity(city);
                            PopulationCity populationCity = new PopulationCity(searchCity.getAllText());
                            if (Main.mainWindow.count.getCount() % 2 == 0) {
                                pointsFirstPlayer = pointsFirstPlayer + populationCity.getPopulation();
                                Main.mainWindow.pointsOfFirstGamer.setText("Очки игрока " + Main.mainWindow.nickNameFirstPlayerField.getText() + ":" + pointsFirstPlayer);
                                Main.mainWindow.yourTurn.setText("Ход игрока " + Main.mainWindow.nickNameSecondPlayerField.getText());
                                Main.mainWindow.logOfCityText.setText(city + "\n" + Main.mainWindow.logOfCityText.getText());
                                Main.mainWindow.count.setCount();
                            } else {
                                pointsSecondPlayer = pointsSecondPlayer + populationCity.getPopulation();
                                Main.mainWindow.pointsOfSecondGamer.setText("Очки игрока " + Main.mainWindow.nickNameSecondPlayerField.getText() + ":" + pointsSecondPlayer);
                                Main.mainWindow.yourTurn.setText("Ход игрока " + Main.mainWindow.nickNameFirstPlayerField.getText());
                                Main.mainWindow.logOfCityText.setText(city + "\n" + Main.mainWindow.logOfCityText.getText());
                                Main.mainWindow.count.setCount();
                            }
                        if(Main.mainWindow.count.getCount()==0) {
                            Main.mainWindow.turnOfEndLabel.setVisible(false);
                            Main.mainWindow.yourTurn.setVisible(false);
                            Main.mainWindow.yourCityOnWord.setVisible(false);
                            Main.mainWindow.pointsOfFirstGamer.setVisible(false);
                            Main.mainWindow.pointsOfSecondGamer.setVisible(false);
                            Main.mainWindow.areaForAnswerField.setVisible(false);
                            Main.mainWindow.logOfCityLabel.setVisible(false);
                            Main.mainWindow.helloLabel.setVisible(true);
                            Main.mainWindow.logOfCityText.setVisible(false);
                            Main.mainWindow.acceptAnswerButton.setVisible(false);

                            if (pointsFirstPlayer == pointsSecondPlayer) {
                                Main.mainWindow.helloLabel.setText("Ничья ");
                            } else {
                                if (pointsFirstPlayer > pointsSecondPlayer) {
                                    Main.mainWindow.helloLabel.setText("Победил игрок " + Main.mainWindow.nickNameFirstPlayerField.getText());
                                } else {
                                    Main.mainWindow.helloLabel.setText("Победил игрок " + Main.mainWindow.nickNameSecondPlayerField.getText());
                                }
                            }
                        }
                            Main.mainWindow.areaForAnswerField.setText(null);
                        } else {
                        if(c==0){
                            Main.mainWindow.yourCityOnWord.setText("Вы ввели город не на ту букву, Вам город на букву " + itsTrue.getLastLetter().toUpperCase());
                        }
                        else{
                            Main.mainWindow.yourCityOnWord.setText("Такой город уже вводили,вам на " + itsTrue.getLastLetter().toUpperCase());
                        }

                            Main.mainWindow.areaForAnswerField.setText(null);
                        }
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }



    }
