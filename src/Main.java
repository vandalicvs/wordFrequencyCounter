import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TextReader reader = new TextReader();
        HashMap<String, Integer> wordCount = reader.readText();
        reader.getResults(wordCount);
    }
}