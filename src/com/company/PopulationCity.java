package com.company;


public class PopulationCity {
    public int population;

    public PopulationCity(String allText) throws Exception {

        String strWithInfoPopulation;

        strWithInfoPopulation = allText.substring(allText.indexOf("nowrap"));
        strWithInfoPopulation = strWithInfoPopulation.substring(0, strWithInfoPopulation.indexOf("человек"));
        strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("</span>"), strWithInfoPopulation.indexOf("<sup"));
        strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf(">") + 1);
        strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
        population = Integer.parseInt(strWithInfoPopulation);

    }

    public int getPopulation() {
        return population;
    }
}