package Functions;

import java.util.*;


public class Functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1:");
        int num1 = sc.nextInt();
        System.out.print("Enter Number2:");
        int num2 = sc.nextInt();

        int ans = sum(num1,num2);
        System.out.println(ans);


        Greeting();

        int ans2 = Sum();
        System.out.println(ans2);
        System.out.println(Sum());
    }


    //functions.Functions are nothing but a block of code.
    static int sum(int num1, int num2){
        return num1+num2;
    }

    static void Greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Hello I'm "+ name);
    }

    static int Sum(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Number1:");
        int num1 = sc.nextInt();
        System.out.print("Enter Number2:");
        int num2 = sc.nextInt();
        int ans = num1 + num2;
        return ans;
    }
}
