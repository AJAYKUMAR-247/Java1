package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDimensionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][][] threeDimensional = new int[3][][]; // Three dimensional array means that the array of array has an array itself

        //To mention the size

        for (int i = 0; i < threeDimensional.length; i++) {
            System.out.println("Enter the columns for " + i + " row:");
            int rows = sc.nextInt();
            threeDimensional[i] = new int[rows][];  // Allocate the second dimension
        }

        System.out.println(Arrays.deepToString(threeDimensional));

        for (int i = 0; i < threeDimensional.length; i++) {
            for (int j = 0; j < threeDimensional[i].length; j++) {
                System.out.println("Enter the columns for " + i + " row:");
                threeDimensional[i][j] = new int[sc.nextInt()];
            }
        }

        System.out.println(Arrays.deepToString(threeDimensional));

        for (int i = 0; i < threeDimensional.length; i++) {
            for (int j = 0; j < threeDimensional[i].length; j++) {
                for (int k = 0; k < threeDimensional[i][j].length; k++) {
                    System.out.println("Enter the columns for " + i + " row:");
                    threeDimensional[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println(Arrays.deepToString(threeDimensional));
    }
}
