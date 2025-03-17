package Functions;

import java.util.*;

public class shadowing {
    int shadowing1 = 99;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        shadowing obj = new shadowing();
        obj.shadowing1 = 1000;

        //Here the local variable(lower level) is overriding the instance variable(upper level).
        System.out.println("functionsShadowing :"+obj.shadowing1);

        int shadowing2 = 999;
        //local variable
        {
            shadowing obj1 = new shadowing();
            obj1.shadowing1 = 888;
            System.out.println("BlockScope Shadowing: "+ obj1.shadowing1);

            shadowing2 = 9000;
            //block scope
            System.out.println("functions.shadowing :"+shadowing2);// Here the upper level is overriding by the lower level.
        }
    }
}
