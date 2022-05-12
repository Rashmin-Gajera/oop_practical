import java.util.*;

public class prc_05 {
    public static void main(String[] args) {

        int[] num;
        int i, j, temp;
        num = new int[3];
        try (Scanner sc = new Scanner(System.in)) {
            for (i = 0; i < 3; i++) {
                System.out.print("Enter "+(i+1)+" Number:");
                num[i] = sc.nextInt();
            }
            sc.close();
        }
        // shorting array
        for (i = 0; i < 3; i++) {
            for (j = i + 1; j < 3; j++) {

                if (num[j] > num[i]) {
                    temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        for(i=0; i<3; i++){
            System.out.print(num[i]+"  ");
            
        }
      
    }
   
}