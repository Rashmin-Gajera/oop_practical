import java.util.*;

public class prc_02{


    public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
         System.out.println("Equation-01: 3.4x+50.2y=44.5 ");
         System.out.println("Equation-02: 2.1x+55y=5.9 ");
         System.out.println("");

         double a=3.4, b=50.2,c=2.1,d=55,e=44.5,f=5.9,x=0,y=0;
         x=(e*d-b*f)/(a*d-b*c);
         y=(a*f-e*c)/(a*d-b*c);

         System.out.println("Value of x:"+x);
         System.out.println("Value of y:"+y);
         
        sc.close();

    }

}