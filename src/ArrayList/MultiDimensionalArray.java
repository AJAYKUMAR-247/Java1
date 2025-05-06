package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //You have declared a list of arraylist, but you have to initialize the list
        for (int i = 0; i <= 3; i++) {
            list.add(new ArrayList<>());
        }

        // Fill the 2D list with input
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {  // 3 elements in each row
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
