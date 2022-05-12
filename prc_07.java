import java.util.*;

public class prc_07{
    public static void main(String[] args) {
       int i;
       System.out.print("Your Number Plate is :");
       Random rn=new Random();
       for (int j = 1; j <= 7; j++) {
           if (j<=3) {
            char c = (char) (65+rn.nextInt(26) );   
            System.out.print(c);
            if (j==3) {
            System.out.print(" ");
                
            }

           }else{

            i=rn.nextInt(10);
            System.out.print(i);
           }
           
       }
    }
}


