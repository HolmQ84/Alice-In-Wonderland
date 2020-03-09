import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordList {
    Map<String, Integer> words = new HashMap<>();

    public WordList() throws FileNotFoundException {
        generateMap();
    }

    public void generateMap() throws FileNotFoundException {
        Scanner scan1 = new Scanner(new File("C:/Users/marti/IdeaProjects/3.Semester/AliceInWonderland/src/alice.txt"));
        while (scan1.hasNextLine()) {
            String line = scan1.nextLine();
            Scanner scan2 = new Scanner(line);
            String word;
            while (scan2.hasNext()) {
                word = scan2.next();
                word = word.replace(".","");
                word = word.replace(",","");
                word = word.replace("'","");
                word = word.replace(":","");
                word = word.replace("-","");
                word = word.replace(";","");
                word = word.replace("(","");
                word = word.replace(")","");
                word = word.replace("!","");
                word = word.replace("?","");
                word = word.replace("\"","");
                word = word.replace("]","");
                word = word.replace("[","");
                word = word.replace("_","");
                word = word.toLowerCase();
                if (words.containsKey(word)) {
                    words.put(word, words.get(word) + 1);
                } else {
                    words.put(word,1);
                }
            }
            line = scan1.nextLine();

            scan2.close();
        }
        scan1.close();
    }

    public void printWordList() {
        for (Map.Entry<String, Integer> current: words.entrySet()) {
            System.out.println("Word: "+current.getKey()+" - is found: "+current.getValue()+" times.");
        }
    }

    public void showOverview() {
        int totalWords = 0;
        for (Map.Entry<String, Integer> current: words.entrySet()) {
            totalWords += current.getValue();
        }
        System.out.println("Total number of words: " +totalWords);
        System.out.println("Total number of different words: " +words.size());
    }

    public void wordSearch(String word) {
        if (words.containsKey(word)) {
            System.out.println("Ordet '"+word+"' bliver brugt: "+words.get(word)+" gange.");
        }
    }

    public void sortedList(Map<String, Integer> map) {
        TreeMap<String, Integer> treemap = new TreeMap<>(map);
        for (Map.Entry<String, Integer> current: map.entrySet()) {
            treemap.put(current.getKey(), current.getValue());;
        }
        for (Map.Entry<String, Integer> current: treemap.entrySet()) {
            System.out.println("Word: "+current.getKey()+" - is found: "+current.getValue()+" times.");
        }
    }
}
