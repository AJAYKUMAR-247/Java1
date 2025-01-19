import java.util.*;

public class shadowing {
    int shadowing1 = 99;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        shadowing obj = new shadowing();
        obj.shadowing1 = 1000;

        //Here the local variable(lower level) is overriding the instance variable(upper level).
        System.out.println("shadowing :"+obj.shadowing1);

        int shadowing2 = 999;
        //local variable
        {
            shadowing2 = 1000;
            //block scope
            System.out.println("shadowing :"+shadowing2);// Here the upper level is overriding by the lower level.
        }
    }
}
