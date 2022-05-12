import java.util.*;

public class prc_03{


    public static void main(String[] args) {
     
        double val ; double feet;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value(In Meter):");
         val=sc.nextDouble();
         feet= val*3.281;
         System.out.println("Value In Fit is: "+feet);
         sc.close();

    }

}