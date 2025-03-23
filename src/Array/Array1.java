package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter Number for index " + i + " =");
            arr1[i] = sc.nextInt();
        }


        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Number at index : " + i + " is " + arr1[i]);
        }

        System.out.println(arr1); //This will print the memory address of the array instead of printing the elemments of the array,
        // why because java does not ovveride the toString() in arrays.

        System.out.println(Arrays.toString(arr1));// Array.toString() will convert the array into human readable format.
        //Array.toString() belongs to Array class, it takes the array as an argument and returns the String representation of that array.

    }
}
