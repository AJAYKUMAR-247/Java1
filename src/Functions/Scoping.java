package Functions;

import java.util.*;

public class Scoping {
    /*Instance variable , scope is instance scope.
    1. We can access this instance variable inside all non-static methods  in this class
    2. To access this inside a static method we have to create a object for this class
     */

    int num = 22;
    public static void main(String[] args){

        //Obj for accsessing the instance variable
        Scoping obj = new Scoping();
        int instanceScoping_num = obj.num;
        System.out.println("InstanceScopingNumber "+instanceScoping_num);

        //local variable this is only available inside the block where it is declared.
        int a = 97;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2:");
        int num2 = sc.nextInt();
        int sum = sum(num1, num2);
        System.out.println("The sum of two numbers is:"+ sum);
        /*Block Scope:
        1.The variables which are already declared in its outside scope is accessible and we can able to change
        the value, but we can't re-initialize it.
        2.The variable which is declared inside is only accessible inside the block.
         */
        {
//            int a = 34;
            a=89;
            System.out.println("Inside Block Scope:"+a);
            int b = 23;

        }
         int b=34;
        System.out.println("LocalVariable blockChange:"+a);

        /*Loop scope
        1.The variables which are declared inside the loop-scope is only accessible inside the loop
        2.We can able to access the variables which are declared in its outside scope and able to change the value.

         */
        for(int i = 0;i<=3;i++){
            a = 355;
            System.out.println("LocalVariable inloopscope:" +a);
        }
    }
    /*Function Scope
    1. The variables which are declared inside the function are only accessible inside the function.
    2. Same as the variables declared outside the function is also not accessible inside the function.
     */
    static int sum(int num1, int num2){
        return num1 + num2;
    }
}
