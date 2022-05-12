import java.util.*;
public class prc_06{
    public static void main(String[] args) {
        char c,check;
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a Letter:");
         c=sc.next().charAt(0);
         check=Character.toUpperCase(c);
         if (check==65 || check==69 || check==73 ||check==79||check==85 ) {

         System.out.print("Entered Character "+ c+ " is Vowel");
         }else{
         System.out.print("Entered Character "+ c+ " is Constant");
         }

         
        sc.close();
    }
}
