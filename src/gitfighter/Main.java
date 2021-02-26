package gitfighter;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var rand = new Random();
        System.out.println("Hello, World!");

        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(100));
        }
    }
}
