package com.company;

import javax.swing.*;
import java.awt.*;



public class MainWindow extends JFrame  {

    //announce graphical elements
    public JButton OnePlayerButton = new JButton("Один игрок");
    public JButton TwoPlayerButton = new JButton("Два игрока");
    public JButton RulesButton = new JButton("Правила");
    public JButton ExitFromMainMenuButton = new JButton("Выход");
    public JButton BackButton = new JButton("Назад");
    public JButton ExitFromRulesAndGameButton = new JButton("Выход");
    public JButton AcceptAnswerButton = new JButton("Принять ответ");
    public JButton AcceptNickNameButton = new JButton("Принять имена");
    public JTextArea RulesText = new JTextArea("Правила ");
    public JTextArea LogOfCityText = new JTextArea();
    public JTextField NickNameFirstPlayerField = new JTextField();
    public JTextField NickNameSecondPlayerField = new JTextField();
    public JTextField AreaForAnswerField = new JTextField();
    public JLabel LogOfCityLabel = new JLabel("Последние города:");
    public JLabel HelloLabel = new JLabel("Добро пожаловать");
    public JLabel NickNameOneLabel = new JLabel("Введите имя первого игрока:");
    public JLabel NickNameTwoLabel = new JLabel("Введите имя второго игрока:");
    public JLabel TurnOfEndLabel = new JLabel("Ходов до конца игры :100 ");
    public JLabel YourTurn = new JLabel("Ход игрока ВасяПупкин228");
    public JLabel YourCityOnWord = new JLabel("Вам город на букву Г");
    public JLabel PointsOfFirstGamer = new JLabel("Васяпупкин228 :");
    public JLabel PointsOfSecondGamer = new JLabel("Васяпупкин1488 :");








    public MainWindow() {
        //create window
        super("Игра в города");
        this.setBounds(400, 100, 700, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //create container
        Container container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.green);


        //add graphical elements in container
        container.add(OnePlayerButton);
        container.add(TwoPlayerButton);
        container.add(RulesButton);
        container.add(ExitFromMainMenuButton);
        container.add(BackButton);
        container.add(ExitFromRulesAndGameButton);
        container.add(AcceptAnswerButton);
        container.add(AcceptNickNameButton);
        container.add(RulesText);
        container.add(LogOfCityText);
        container.add(NickNameFirstPlayerField);
        container.add(NickNameSecondPlayerField);
        container.add(AreaForAnswerField);
        container.add(LogOfCityLabel);
        container.add(HelloLabel);
        container.add(NickNameOneLabel);
        container.add(NickNameTwoLabel);
        container.add(TurnOfEndLabel);
        container.add(YourTurn);
        container.add(YourCityOnWord);
        container.add(PointsOfFirstGamer);
        container.add(PointsOfSecondGamer);



        //set coordinates and size graphical elements
        OnePlayerButton.setBounds(300, 150, 100, 30);
        TwoPlayerButton.setBounds(300, 200, 100, 30);
        RulesButton.setBounds(300, 250, 100, 30);
        ExitFromMainMenuButton.setBounds(300, 300, 100, 30);
        BackButton.setBounds(100, 400, 100, 30);
        ExitFromRulesAndGameButton.setBounds(500, 400, 100, 30);
        AcceptAnswerButton.setBounds(250, 240, 150, 30);
        AcceptNickNameButton.setBounds(300, 230, 200, 50);
        RulesText.setBounds(200, 50, 300, 300);
        LogOfCityText.setBounds(0, 140, 150, 200);
        NickNameFirstPlayerField.setBounds(300, 110, 200, 30);
        NickNameSecondPlayerField.setBounds(300, 210, 200, 30);
        AreaForAnswerField.setBounds(200, 200, 200, 30);
        LogOfCityLabel.setBounds(000,100,150,40);
        HelloLabel.setBounds(290,50,120,50);
        NickNameOneLabel.setBounds(80,100,200,50);
        NickNameTwoLabel.setBounds(80,200,200,50);
        TurnOfEndLabel.setBounds(200,280,200,30);
        YourTurn.setBounds(350,50,200,30);
        YourCityOnWord.setBounds(250,130,200,30);
        PointsOfFirstGamer.setBounds(500,150,200,30);
        PointsOfSecondGamer.setBounds(500,200,200,30);





        //Set visible of graphical elements
        OnePlayerButton.setVisible(true);
        TwoPlayerButton.setVisible(true);
        RulesButton.setVisible(true);
        BackButton.setVisible(false);
        ExitFromRulesAndGameButton.setVisible(false);
        ExitFromMainMenuButton.setVisible(true);
        AcceptAnswerButton.setVisible(false);
        AcceptNickNameButton.setVisible(false);
        RulesText.setVisible(false);
        LogOfCityText.setVisible(false);
        YourTurn.setVisible(false);
        NickNameFirstPlayerField.setVisible(false);
        NickNameSecondPlayerField.setVisible(false);
        AreaForAnswerField.setVisible(false);
        LogOfCityLabel.setVisible(false);
        HelloLabel.setVisible(true);
        NickNameOneLabel.setVisible(false);
        NickNameTwoLabel.setVisible(false);
        TurnOfEndLabel.setVisible(false);
        YourCityOnWord.setVisible(false);
        PointsOfSecondGamer.setVisible(false);
        PointsOfFirstGamer.setVisible(false);


        //Add constructor for event for Button
        OnePlayerButton.addActionListener(new OnePlayerButtonActionListener());
        TwoPlayerButton.addActionListener(new TwoPlayerButtonActionListener());
        RulesButton.addActionListener(new RulesButtonActionListener());
        BackButton.addActionListener(new BackButtonActionListener());
        AcceptNickNameButton.addActionListener(new AcceptNickNameButtonActionListener());
        AcceptAnswerButton.addActionListener(new AcceptAnswerButtonActionListener());
        ExitFromMainMenuButton.addActionListener(new ExitFromMainMenuButtonActionListener());
        ExitFromRulesAndGameButton.addActionListener(new ExitFromRulesAndGameButtonActionListener());









    }
}

