package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String str = new StringBuilder("aada").reverse().toString();
//
       int n = 324 + sc.nextInt() + Integer.parseInt(str);
//
//                // code here
//                int count = 0;
//                while(n > 0){
//                    n/=10;
//                    count++;
//                }
//
//
//        System.out.println(count);

        System.out.println(n);

//                int n = 100;

        while(n%2 == 0){
            System.out.print(2 + " ");
            n/= 2;
        }

        for(int i = 3; i<= Math.sqrt(n); i+=2){
            while(n%i == 0){
                System.out.print(i + " ");
                n/=i;
            }
        }

        if(n>2){
            System.out.print(n);
        }

        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add(343);

        String s = new String("Ajay");

        System.out.println(s.equals("Ajay") ? "True" : "False");
    }
}
