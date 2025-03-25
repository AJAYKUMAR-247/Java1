package String;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "Ajay";// String is not a primitive data type in java, it's a class.

        String name1 = new String("Ajay");// No need to create a string a like this because by default the java String class takes care of object creation.

//        Above both the strings(name and name1) are pointing towards the same object in the String constant pool which is present in memory

        name1 = name1 + "Kumar";// Now java will check in String pool, whether the new string is there are not, if not it will create a new string instead of modifing the existing one.


        System.out.println(name.hashCode());
        System.out.println(name1.charAt(2));
    }
}
