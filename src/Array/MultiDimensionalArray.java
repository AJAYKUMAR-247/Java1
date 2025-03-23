package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//       MultiDimensional Array is nothing but a Array of Array
        int[][] nums = new int[3][4];  // In the creation of the Multi Dimensional Array, the first value we're passing is to represents how many arrays we want
        // And the second value we're represents the how many columns in a row.

        System.out.println(Arrays.toString(nums));// This will not work why because, Array.toString() is only for single dimensional array.

        System.out.println(Arrays.deepToString(nums)); // This will print the two string properly.

        System.out.println(nums[0].length);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println(Arrays.deepToString(nums));

        for (int[] arr : nums) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
