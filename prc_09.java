import java.util.*;

public class prc_09 {
    public static int gcd(int num1, int num2) {
        int Gcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {

                Gcd = i;
            }
        }
        return Gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, Gcd;
        System.out.print("Enter First Number:");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number:");
        num2 = sc.nextInt();
        Gcd = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is a " + Gcd);
        sc.close();
    }
}
