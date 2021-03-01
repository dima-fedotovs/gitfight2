package gitfighter;

import java.util.Base64;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var rand = new Random();
        System.out.println("Hello, World!!!");
        System.out.println("1 - Hello, World!!!");
        System.out.println("2 - Hello, World!!!");
        System.out.println("3 - Hello, World!!!");
        System.out.println("4 - Hello, World!!!");
        System.out.println("5 - Hello, World!!!");
        System.out.println("6 - Hello, World!!!");
        System.out.println("7 - Hello, World!!!");
        System.out.println("8 - Hello, World!!!");
        System.out.println("9 - change in rebase_test branch");

        printNumbers(rand);
        System.out.println("9 - rebase test in master");
        System.out.println("very useful change");
        System.out.println("second very useful change");
    }

    private static void printNumbers(Random rand) {
        for (int i = 0; i < 10; i++) {
            var arr = new byte[50];
            rand.nextBytes(arr);
            System.out.println(Base64.getEncoder().withoutPadding().encodeToString(arr));
        }
    }
}
