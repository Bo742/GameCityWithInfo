package com.company;

import java.io.*;
import java.net.*;
import java.util.*;

public class SearchCity {
    public String allText;

    public SearchCity(String city) throws Exception {

        if (Main.mainWindow.count.getCount() > 0) {
            //set Scanner
            Scanner scannerOfSite;


            //Connected WIKI
            URL wiki;
            URLConnection wikiCon = null;
            wiki = new URL("https://ru.wikipedia.org/wiki/" + city);
            wikiCon = wiki.openConnection();

            //Set variable
            String stringInText;
            String stringWithInfoPopulation = "";
            long lengthAllText;

            //Reading information
            InputStream inputStream;

            //get length of page and set AllText
            try {
                lengthAllText = wikiCon.getContentLengthLong();
                if (lengthAllText != 0) {
                    inputStream = wikiCon.getInputStream();
                    scannerOfSite = new Scanner(inputStream);
                    while (scannerOfSite.hasNext()) {
                        stringInText = scannerOfSite.nextLine();
                        allText = allText + stringInText + "\n";
                    }
                    inputStream.close();
                }
            } catch (SocketException e1) {
                Main.mainWindow.yourCityOnWord.setText("Ошибка подключения к интернету");
                return;
            } catch (FileNotFoundException e3) {
                Main.mainWindow.yourCityOnWord.setText("Такого слова не существует");
                return;
            } catch (UnknownHostException e) {
                Main.mainWindow.yourCityOnWord.setText("Ошибка подключения к интернету");
                return;
            }

            //Set variable
            String beginWordForCity = "infobox";
            String endWordForCity = "<span";
            String resultString = "\nНеобходимая для поиска строка не найдена\n";
            boolean isContain = false;

            //Check city or no
            try {
                resultString = allText.substring(allText.indexOf(beginWordForCity));
                resultString = resultString.substring(0, resultString.indexOf(endWordForCity));
            } catch (StringIndexOutOfBoundsException e) {
            }


            //Finally check city or no
            isContain = resultString.contains("Город") | resultString.contains("Столица");
            if (isContain == false) {
                try {
                    allText=null;
                    wiki = new URL("https://ru.wikipedia.org/wiki/" + city + "_(город)");
                    wikiCon = wiki.openConnection();
                    lengthAllText = wikiCon.getContentLengthLong();
                    if (lengthAllText != 0) {
                        inputStream = wikiCon.getInputStream();
                        scannerOfSite = new Scanner(inputStream);
                        while (scannerOfSite.hasNext()) {
                            stringInText = scannerOfSite.nextLine();
                            allText = allText + stringInText + "\n";
                        }
                        inputStream.close();
                    }
                    resultString = allText.substring(allText.indexOf(beginWordForCity));
                    resultString = resultString.substring(0, resultString.indexOf(endWordForCity));
                } catch (FileNotFoundException e2) {
                    return;
                }
                isContain = true;
            }
            if (isContain) {
                String yourLetter = city.substring(city.length() - 1);
                if(yourLetter.equals("ъ")||yourLetter.equals("ь")||yourLetter.equals("й")||yourLetter.equals("ы")||yourLetter.equals("э")){
                    yourLetter = city.substring(city.length()-2,city.length()-1);
                }
                if(Main.mainWindow.count.getCount()==6){
                Main.mainWindow.count.setCount();
                }
                Main.mainWindow.yourCityOnWord.setText("Вам город на букву " + yourLetter.toUpperCase());
                Main.mainWindow.turnOfEndLabel.setText("Ходов до конца игры:"+Main.mainWindow.count.getCount());


            } else {
                Main.mainWindow.yourCityOnWord.setText("Это не город , введите другое название");
            }

        }
    }
    public String getAllText(){
        return allText;
    }
}


