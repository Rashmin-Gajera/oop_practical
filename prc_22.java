import java.util.Scanner;

class prc_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        System.out.print("Enter five integers: ");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
            product *= list[i];
        }
        System.out.println("The Product of elements is " + product);
        sc.close();
    }
}