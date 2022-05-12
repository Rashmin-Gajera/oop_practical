import java.util.*;

public class prc_15 {

    public static double bin2Dec(String binary) {
        double num = 0;
        int length = 0;
        char c;
        int temp;
        
            length = binary.length();
            for (int i = 0; i < length; i++) {
                c = binary.charAt(i);
                temp = ((int) c) - 48;
                if (temp == 0 || temp == 1) {
                    num += (temp * Math.pow(2, (length - i - 1)));
                } else {
                    num = -1;
                    throw new NumberFormatException("This is not a valid Binary input!");

                }
            }

        return num;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary;
        double decimal;
        System.out.print("Enter Binary String:");
        binary = sc.nextLine();
        decimal = bin2Dec(binary);
        if (decimal != -1) {
            System.out.println("Enquivalently Decimal Number of " + binary + " is a " + decimal);
        }

        sc.close();
    }
}
