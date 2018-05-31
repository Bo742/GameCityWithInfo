package com.company;


public class LastLetter {
     public boolean itsTrue;
     public String lastLetter;
     public String firstLetter;
    public LastLetter(String cityOld,String cityNew){
         lastLetter = cityOld.substring(cityOld.length()-1).toLowerCase();
         firstLetter = cityNew.substring(0,1).toLowerCase();
         if(lastLetter.equals("ъ") || lastLetter.equals("ь")||lastLetter.equals("й")||lastLetter.equals("ы")||lastLetter.equals("э")){
             lastLetter = cityOld.substring(cityOld.length()-2,cityOld.length()-1);
         }
         if (lastLetter==firstLetter){
            itsTrue=true;
        }

    }

    public boolean getItsTrue() {
        return itsTrue;

    }

    public String getLastLetter() {
        return lastLetter;
    }

    public String getFirstLetter() {
        return firstLetter;
    }
}
