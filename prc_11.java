import java.util.*;
public class prc_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[6][6], count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                if (((i + 1) % 2 == 0 && (j + 1) % 2 != 0) || ((i + 1) % 2 != 0 && (j + 1) % 2 == 0)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;

                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        boolean flag = true;
        int i = 0;
        while (i < 6 && flag == true) {
            count = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            i++;
//if count is not odd than we have false our bool variable
            if (count%2 != 0) {
                flag = false;
                System.out.println("Above Statement is not true");
            }
//if we found till last raw of odd number of 1's than we will print this true stetment
            if (i == (6 - 1)) {
                System.out.println("Matrix's every raw and column have an odd number's of 1's");
            }
        }
        sc.close();
    }
}