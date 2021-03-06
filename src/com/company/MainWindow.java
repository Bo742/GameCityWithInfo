package com.company;

import javax.swing.*;
import java.awt.*;
import com.company.ActionListener.*;


public class MainWindow extends JFrame  {
   static public Count count = new Count(6);
    //announce graphical elements

    public JButton twoPlayerButton = new JButton("Два игрока");
    public JButton rulesButton = new JButton("Правила");
    public JButton exitFromMainMenuButton = new JButton("Выход");
    public JButton backButton = new JButton("Назад");
    public JButton exitFromRulesAndGameButton = new JButton("Выход");
    public JButton acceptAnswerButton = new JButton("Принять ответ");
    public JButton acceptNickNameButton = new JButton("Принять имена");
    public JTextArea rulesText = new JTextArea( );
    public JTextArea logOfCityText = new JTextArea();
    public JTextField nickNameFirstPlayerField = new JTextField();
    public JTextField nickNameSecondPlayerField = new JTextField();
    public JTextField areaForAnswerField = new JTextField();
    public JLabel logOfCityLabel = new JLabel("Последние города:");
    public JLabel helloLabel = new JLabel("Добро пожаловать");
    public JLabel nickNameOneLabel = new JLabel("Введите имя первого игрока:");
    public JLabel nickNameTwoLabel = new JLabel("Введите имя второго игрока:");
    public JLabel turnOfEndLabel = new JLabel("Ходов до конца игры:"+ count.getCount());
    public JLabel yourTurn = new JLabel("");
    public JLabel yourCityOnWord = new JLabel("Введите город: ");
    public JLabel pointsOfFirstGamer = new JLabel("");
    public JLabel pointsOfSecondGamer = new JLabel("");






    public MainWindow() {

        //create window
        super("Игра в города");
        this.setBounds(400, 100, 700, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //Create New Font
        Font myFontOnHelloLabel = new Font("TimesNewRoman",Font.BOLD,30);
        Font myFontForButton = new Font("TimesNewRoman",Font.BOLD,18);
        //create container
        Container container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.lightGray);

        //add graphical elements in container

        container.add(twoPlayerButton);
        container.add(rulesButton);
        container.add(exitFromMainMenuButton);
        container.add(backButton);
        container.add(exitFromRulesAndGameButton);
        container.add(acceptAnswerButton);
        container.add(acceptNickNameButton);
        container.add(rulesText);
        container.add(logOfCityText);
        container.add(nickNameFirstPlayerField);
        container.add(nickNameSecondPlayerField);
        container.add(areaForAnswerField);
        container.add(logOfCityLabel);
        container.add(helloLabel);
        container.add(nickNameOneLabel);
        container.add(nickNameTwoLabel);
        container.add(turnOfEndLabel);
        container.add(yourTurn);
        container.add(yourCityOnWord);
        container.add(pointsOfFirstGamer);
        container.add(pointsOfSecondGamer);



        //TwoPlayerButtonSettings
            twoPlayerButton.setBounds(250, 150, 200, 50);
            twoPlayerButton.setVisible(true);
            twoPlayerButton.addActionListener(new TwoPlayerButtonActionListener());
            twoPlayerButton.setFont(myFontForButton);

        //RulesButtonSettings
            rulesButton.setBounds(250, 230, 200, 50);
            rulesButton.setVisible(true);
            rulesButton.addActionListener(new RulesButtonActionListener());
            rulesButton.setFont(myFontForButton);



        //ExitFromMainMenuButtonSettings
            exitFromMainMenuButton.setBounds(250, 310, 200, 50);
            exitFromMainMenuButton.setVisible(true);
            exitFromMainMenuButton.addActionListener(new ExitFromMainMenuButtonActionListener());
            exitFromMainMenuButton.setFont(myFontForButton);

        //BackButtonSettings
            backButton.setBounds(50, 370, 200, 50);
            backButton.setVisible(false);
            backButton.addActionListener(new BackButtonActionListener());
            backButton.setFont(myFontForButton);

        //AcceptAnswerButtonSettings
            acceptAnswerButton.setBounds(250, 240, 200, 30);
            acceptAnswerButton.setVisible(false);
            acceptAnswerButton.addActionListener(new AcceptAnswerButtonActionListener());
            acceptAnswerButton.setFont(myFontForButton);

        //AcceptNickNameButtonSettings
            acceptNickNameButton.setBounds(300, 270, 200, 50);
            acceptNickNameButton.setVisible(false);
            acceptNickNameButton.addActionListener(new AcceptNickNameButtonActionListener());
            acceptNickNameButton.setFont(myFontForButton);

        //ExitFromRulesAndGameButtonSettings
            exitFromRulesAndGameButton.setBounds(400, 370, 200, 50);
            exitFromRulesAndGameButton.setVisible(false);
            exitFromRulesAndGameButton.addActionListener(new ExitFromRulesAndGameButtonActionListener());
            exitFromRulesAndGameButton.setFont(myFontForButton);

        //RulesTextSettings
            rulesText.setBounds(200, 50, 300, 300);
            rulesText.setVisible(false);
            rulesText.setEditable(false);

        //LogOfCityTextSettings
            logOfCityText.setBounds(50, 140, 150, 200);
            logOfCityText.setVisible(false);
            logOfCityText.setEditable(false);

        //NickNameFirstPlayerFieldSettings
            nickNameFirstPlayerField.setBounds(300, 110, 200, 30);
            nickNameFirstPlayerField.setVisible(false);
            nickNameFirstPlayerField.setText(null);

        //NickNameSecondPlayerFieldSettings
            nickNameSecondPlayerField.setBounds(300, 210, 200, 30);
            nickNameSecondPlayerField.setVisible(false);
            nickNameSecondPlayerField.setText(null);

        //AreaForAnswerFieldSettings
            areaForAnswerField.setBounds(250, 200, 200, 30);
            areaForAnswerField.setVisible(false);

        //HelloLabelSettings
             helloLabel.setBounds(200,50,500,50);
             helloLabel.setVisible(true);
             helloLabel.setFont(myFontOnHelloLabel);

        //LogOfCityLabelSettings
            logOfCityLabel.setBounds(50,100,150,40);
            logOfCityLabel.setVisible(false);

        //NickNameOneLabelSettings
            nickNameOneLabel.setBounds(80,100,200,50);
            nickNameOneLabel.setVisible(false);

        //NickNameTwoLabelSettings
            nickNameTwoLabel.setBounds(80,200,200,50);
            nickNameTwoLabel.setVisible(false);

        //YourTurnSettings
            yourTurn.setBounds(250,50,200,30);
            yourTurn.setVisible(false);

        //YourCityOnWordSettings
            yourCityOnWord.setBounds(250,160,500,30);
            yourCityOnWord.setVisible(false);

        //TurnOfEndSettings
            turnOfEndLabel.setBounds(250,280,200,30);
            turnOfEndLabel.setVisible(false);

        //PointsOfFirstGamerSettings
            pointsOfFirstGamer.setBounds(470,150,200,30);
            pointsOfFirstGamer.setVisible(false);

        //PointsOfSecondGamerSettings
            pointsOfSecondGamer.setBounds(470,200,200,30);
            pointsOfSecondGamer.setVisible(false);


























    }
}

