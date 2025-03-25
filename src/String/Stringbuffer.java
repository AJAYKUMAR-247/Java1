package String;

import java.util.Scanner;

public class Stringbuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Both StringBuffer and StringBuilder are similar, the only difference between them is StringBuffer is thread safe, whereas StringBuffer is not thread safe.
        StringBuffer str = new StringBuffer("Ajay");

        str.append(" Kumar");
        System.out.println(str.capacity()); // By default the capacity of a stringBuffer is 16, if you add ajay it took 4, so the capacity will increase to 20.
//        Why it is giving 16 extra space is because stringbuffer is mutable, when you want to add something there may not be space, so it is storing with extra space a well.

        str.deleteCharAt(2);

        System.out.println(str);
    }
}
