import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextReader {

    public HashMap<String, Integer> readText() {
        HashMap<String, Integer> wordCount = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String word = sc.next().trim().replaceAll("[.,:;!?\"']", "");
            if  (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word,count + 1);
            } else {
                wordCount.put(word,1);
            }
            }

        return wordCount;
        }

    public void getResults(HashMap<String, Integer> wordCount) {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + " : " + count);
        }
    }
}


