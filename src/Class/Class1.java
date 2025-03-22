package Class;

import java.util.*;

class Calculator {
    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

}

public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1:");
        System.out.println("Enter number2:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        System.out.println("Result :" + result);
    }
}
