import java.util.*;

public class prc_04{
    public static void main(String[] args) {
     
        double weight_pound, height_inch,weight_kg,height_meter,BMI;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter yout weight(In Pound):");
         weight_pound=sc.nextDouble();
         System.out.println("Enter yout height(In Inch):");
         height_inch=sc.nextDouble();
        //convert value in kg or meter for find BMI
         weight_kg=0.45359237 *weight_pound;
         height_meter=0.0254*height_inch;
         BMI=(weight_kg)*(height_meter*height_meter);
         System.out.println("Value of IBM is: "+BMI);
         sc.close();

    }

}