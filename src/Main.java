import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.next().trim().replaceAll("[.,:;!?\"']", "");
            System.out.println(line);
        }
    }
}