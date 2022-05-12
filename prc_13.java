import java.util.*;
public class prc_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr;
        char current;
        int l;
        int operator = 0, space_before = 0, space_after = 0;
        ;
        boolean flag = true;
        System.out.print("Enter Your Expression:");
        expr = sc.nextLine();
        l = expr.length();

        for (int i = 0; i < l; i++) {
            current = expr.charAt(i);

            if (current == 42 || current == 43 || current == 45 || current == 47) {
                operator++;
            } else if (current >= 48 && current <= 57) {
                continue;
            } else if (current == ' ') {
                if (operator == 0) {
                    space_before++;
                } else{
                    space_after++;
                }
                   
            } 
            else {
                flag = false;
            }

        }
        if (flag == true) {
            int result = 0;
            int i = 0;

            while (expr.charAt(i) != '+' && expr.charAt(i) != '-' && expr.charAt(i) != '*' && expr.charAt(i) != '/') {
                i++;
            }

            switch (expr.charAt(i)) {
                case '+':
                    result = Integer.parseInt(expr.substring(0, i - space_before))
                            + Integer.parseInt(expr.substring(i + 1 + space_after, expr.length()));
                    break;
                case '-':
                    result = Integer.parseInt(expr.substring(0, i - space_before))
                            - Integer.parseInt(expr.substring(i + 1 + space_after, expr.length()));
                    break;
                case '*':
                    result = Integer.parseInt(expr.substring(0, i - space_before))
                            * Integer.parseInt(expr.substring(i + 1 + space_after + 1, expr.length()));
                    break;
                case '/':
                    result = Integer.parseInt(expr.substring(0, i - space_before))
                            / Integer.parseInt(expr.substring(i + 1 + space_after + 1, expr.length()));
                    break;
            }

            System.out.println(expr.substring(0, i - space_before) + ' ' + expr.charAt(i) + ' '
                    + expr.substring(i + space_after + 1, expr.length())
                    + " = " + result);

            sc.close();
        } else {
            System.out.println(expr + " is not a valid Expression!");

        }
    }
}
