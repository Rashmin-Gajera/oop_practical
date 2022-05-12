import java.util.*;
public class prc_16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number; int length,mid=0; char current;
         System.out.print("Enter a Decimal Number:");
         number=sc.nextLine();
         length=number.length();

         for (int i=0; i<length; i++){
            current = number.charAt(i);
            if (current=='.') {
                 mid=i;
                 break;
             }
         }

         if (mid==0) {
         System.out.print("Fraction Part is .00");
         }else{
         System.out.print("Fraction Part is ");

             for(int i=mid; i<length; i++){
                current = number.charAt(i);
                System.out.print(current);
             }
         }

        sc.close();
    }
}
