import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Population {
    public static void main(String[] args) throws Exception {
        String city = "зима";
        URL wiki;
        URLConnection wikiCon = null;


        wiki = new URL("https://ru.wikipedia.org/wiki/" + city);
        wikiCon = wiki.openConnection();


        String s;
        String allText = "";
        String strWithInfoPopulation = "";
        InputStream inStream;
        Scanner sc;
        long length;
        length = wikiCon.getContentLengthLong();
        if (length != 0) {
            inStream = wikiCon.getInputStream();
            sc = new Scanner(inStream);
            while (sc.hasNext()) {
                s = sc.nextLine();
                allText = allText + s + "\n";
            }
            inStream.close();
        }

        int population;
        try{
            strWithInfoPopulation = allText.substring(allText.indexOf("nowrap"));
            strWithInfoPopulation = strWithInfoPopulation.substring(0, strWithInfoPopulation.indexOf("человек"));
            strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("</span>"), strWithInfoPopulation.indexOf("<sup"));
            strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf(">") + 1);
            strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
            population = Integer.parseInt(strWithInfoPopulation);
            System.out.println("Население: " + population);
        } catch (StringIndexOutOfBoundsException e){
            allText = null;
            wiki = new URL("https://ru.wikipedia.org/wiki/" + city + "_(город)");
            wikiCon = wiki.openConnection();
            length = wikiCon.getContentLengthLong();
            if (length != 0) {
                inStream = wikiCon.getInputStream();
                sc = new Scanner(inStream);
                while (sc.hasNext()) {
                    s = sc.nextLine();
                    allText = allText + s + "\n";
                }
                inStream.close();
            }
            strWithInfoPopulation = allText.substring(allText.indexOf("nowrap"));
            strWithInfoPopulation = strWithInfoPopulation.substring(0, strWithInfoPopulation.indexOf("человек"));
            strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("</span>"), strWithInfoPopulation.indexOf("<sup"));
            strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf(">") + 1);
            strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
            population = Integer.parseInt(strWithInfoPopulation);
            System.out.println("Население: " + population);
        }
        catch (NumberFormatException e1){
            allText = null;
            wiki = new URL("https://ru.wikipedia.org/wiki/" + city + "_(город)");
            wikiCon = wiki.openConnection();
            length = wikiCon.getContentLengthLong();
            if (length != 0) {
                inStream = wikiCon.getInputStream();
                sc = new Scanner(inStream);
                while (sc.hasNext()) {
                    s = sc.nextLine();
                    allText = allText + s + "\n";
                }
                inStream.close();
            }
            strWithInfoPopulation = allText.substring(allText.indexOf("nowrap"));
            strWithInfoPopulation = strWithInfoPopulation.substring(0, strWithInfoPopulation.indexOf("человек"));
            strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf("</span>"), strWithInfoPopulation.indexOf("<sup"));
            strWithInfoPopulation = strWithInfoPopulation.substring(strWithInfoPopulation.indexOf(">") + 1);
            strWithInfoPopulation = strWithInfoPopulation.replaceAll("&#160;", "");
            population = Integer.parseInt(strWithInfoPopulation);
            System.out.println("Население: " + population);
        }
    }
}
