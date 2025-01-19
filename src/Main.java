import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        switch (n){
            case 1 -> System.out.println("Ajay");
            case 2 -> System.out.println("Kumar");
            default -> System.out.println("Unknown");
        }

        for(;;){
            System.out.println("For loop");
        }

    }
}