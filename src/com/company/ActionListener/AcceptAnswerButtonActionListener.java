package com.company.ActionListener;

import com.company.Main;
import com.company.SearchCity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcceptAnswerButtonActionListener implements ActionListener  {
    @Override
    public void actionPerformed(ActionEvent e)  {
       if (Main.mainWindow.areaForAnswerField.getText().isEmpty()) {
           Main.mainWindow.yourCityOnWord.setText("Введите город");
           }
       else{
           try {
               SearchCity searchCity = new SearchCity(Main.mainWindow.areaForAnswerField.getText());
           } catch (Exception e1) {
               e1.printStackTrace();
           }
       }

    }
}