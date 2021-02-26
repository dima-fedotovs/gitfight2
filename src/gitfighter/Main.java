package gitfighter;

import java.util.Base64;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var rand = new Random();
        System.out.println("Hello, World!");

        for (int i = 0; i < 10; i++) {
            var arr = new byte[25];
            rand.nextBytes(arr);
            System.out.println(Base64.getEncoder().withoutPadding().encodeToString(arr));
        }
    }
}
