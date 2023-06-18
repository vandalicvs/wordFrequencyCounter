import java.util.HashMap;
import java.util.Scanner;

public class TextReader {

    public void readText() {
        HashMap<String, Integer> wordCount = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String word = sc.next().trim().replaceAll("[.,:;!?\"']", "");
            System.out.println(word);
            wordCount.put(word, 1);
        }
    }

}
