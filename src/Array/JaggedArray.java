package Array;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] jaggedArray = new int[3][]; // This is called Jagged Arrays.

//       Jagged Arrays is a multidimensional array, where the sub-arrays ca have different length.

        //To specify the different length of these arrays

        System.out.println("Enter the size of the subarrays :");
        jaggedArray[0] = new int[sc.nextInt()];
        jaggedArray[1] = new int[sc.nextInt()];
        jaggedArray[2] = new int[sc.nextInt()];

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println(Arrays.deepToString(jaggedArray));

        for (int[] arr : jaggedArray) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
