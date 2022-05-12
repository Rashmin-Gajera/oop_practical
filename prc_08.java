import java.util.Scanner;

public class prc_08 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        n = sc.nextInt();
        boolean flag = true;
        end: while (flag == true) {

            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + "  ");
                    if (n == i) {
                        flag = false;
                        break end;
                    }
                    n = n / i;
                    break;
                }
            }

        }
        sc.close();
    }
}
