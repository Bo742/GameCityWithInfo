package com.company;


public class PopulationCity {
    public int population;

    public PopulationCity(String allText) throws Exception {

        String strWithInfoPopulation;
        try {
            strWithInfoPopulation = allText.substring(allText.indexOf("P1082"));
            strWithInfoPopulation = strWithInfoPopulation.substring(0, strWithInfoPopulation.indexOf("p585"));
            if ((strWithInfoPopulation.indexOf("тыс.") == -1) || (strWithInfoPopulation.indexOf("млн")) == -1) {
                strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("</span>"), strWithInfoPopulation.indexOf("<sup"));
                strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf(">") + 1);
                strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
                strWithInfoPopulation = strWithInfoPopulation.replaceAll(" ","");
                population = Integer.parseInt(strWithInfoPopulation);
            }
            else {
                if (strWithInfoPopulation.indexOf("тыс.") != -1) {
                    strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("nowrap\""), strWithInfoPopulation.indexOf("(<"));
                    strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
                    strWithInfoPopulation = strWithInfoPopulation.replaceAll("тыс.", "000");
                    strWithInfoPopulation = strWithInfoPopulation.replaceAll(" ","");
                    population = Integer.parseInt(strWithInfoPopulation);
                }
                if (strWithInfoPopulation.indexOf("млн") != -1){
                    strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("nowrap\""), strWithInfoPopulation.indexOf("(<"));
                    strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
                    strWithInfoPopulation = strWithInfoPopulation.replaceAll("млн", "000000");
                    strWithInfoPopulation = strWithInfoPopulation.replaceAll(" ","");
                    population = Integer.parseInt(strWithInfoPopulation);
                }
            }

        }
        catch (StringIndexOutOfBoundsException e1){
            strWithInfoPopulation = allText.substring(allText.indexOf("P1082"));
            strWithInfoPopulation = strWithInfoPopulation.substring(0, strWithInfoPopulation.indexOf("P585"));
            strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("nowrap\">"), strWithInfoPopulation.indexOf("(<"));
            strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf(">") + 1);
            strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
            strWithInfoPopulation = strWithInfoPopulation.replaceAll(" ","");
            try {
                population = Integer.parseInt(strWithInfoPopulation);
            } catch (NumberFormatException e){
                strWithInfoPopulation = allText.substring(allText.indexOf("P1082"));
                strWithInfoPopulation = strWithInfoPopulation.substring(0, strWithInfoPopulation.indexOf("P585"));
                strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("</span>"), strWithInfoPopulation.indexOf("<sup"));
                strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf(">") + 1);
                strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
                strWithInfoPopulation = strWithInfoPopulation.replaceAll(" ","");
                population = Integer.parseInt(strWithInfoPopulation);
            }
        }
    }





    public int getPopulation() {
        return population;
    }
}