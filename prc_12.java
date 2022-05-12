import java.util.*;
public class prc_12 {
    public static void main(String[] args) {
        Random rnd = new Random();
        rnd.setSeed(1000);
        int num;
        for (int i = 1; i <= 100; i++) {
// for generate a random number with seed 1000
            num = rnd.nextInt(49);
            System.out.print(num);

// this conditons use to print number in proper manner
            if (num < 10) {
                System.out.print("   ");

            } else {
                System.out.print("  ");

            }
            if (i % 10 == 0) {
                System.out.println("");

            }
        }

    }
}
