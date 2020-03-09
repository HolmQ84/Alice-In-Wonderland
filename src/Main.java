import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    /*
    public static void main(String[] args) {
        WordList words = new WordList();
        words.add
    }
     */

    /*
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("person1","123456789");
        map.put("person2","987654321");
        System.out.println(map.get("person1"));
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" - Value: "+entry.getValue());
        }
        System.out.println(map.get("person1"));
        map.get("person1");
        map.remove("person1");
    }
     */

    public static void main(String[] args) throws FileNotFoundException {
        WordList words = new WordList();
        words.generateMap();
        words.sortedList(words.words);
        System.out.println("-------------------------------------");
        words.showOverview();
        Scanner scan = new Scanner(System.in);
        words.wordSearch(scan.next());
    }
}