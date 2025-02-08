package Functions;

import java.util.*;

public class VarArgs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = sum(23,34,354,343);
        System.out.println("The sum is:"+ sum);

        MixArg("Ajay",89,78,88,85,86);
    }
    static int sum(int ...numbers){
        int total = 0;
        for(int num : numbers){
                total+=num;
        }
        return total;
    }

    static void MixArg(String name, int ...numbers){
        int total = 0;
        for(int num : numbers){
            total += num;
        }
        System.out.println("Hi "+name+" your score is :"+total);
    }

}
