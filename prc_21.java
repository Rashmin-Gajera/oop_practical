import java.io.*;
import java.util.*;

class prc_21 {
    public static void main(String[] args) {
        Random rn = new Random();
        int num;
        try (
                PrintWriter pw = new PrintWriter(new FileOutputStream(new File("123.txt"), true));) {
            for (int i = 1; i <= 100; i++) {
                num = rn.nextInt(99);
                pw.print(num);

                if (num < 10) {
                    pw.print("   ");

                } else {
                    pw.print("  ");

                }
                if (i % 10 == 0) {
                    pw.println("");

                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot create the file.");
            fnfe.printStackTrace();
        }
    }
}