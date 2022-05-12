import java.util.*;

public class prc_10 {

    public static void Reverse(int[] numbers, int n) {
    int temp;
        for(int i=0; i<n/2; i++){
        temp=numbers[i];
        numbers[i]=numbers[n-i-1];
        numbers[n-i-1]=temp;        
        }  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10],n=10;

        for(int i=0; i<n; i++){
        System.out.print("Enter "+(i+1)+" Number:");
        numbers[i]=sc.nextInt();
        }
//call the method for reverse the array
        Reverse(numbers, n);
//print the element in reverse manner
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+"  ");
            }

        sc.close();
    }
}
