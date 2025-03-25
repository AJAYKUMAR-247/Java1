package Oops.Constructors;

class Cons {
    int age;
    String name;

    // This is called as constructor, constructors are similar to methods, but it does not return any value
    // Construdtors are used to set a default values for the properties of the class.

    public Cons() {
        age = 12;
        name = "Ajay";
        System.out.println("Constructor");
    }
}

public class Constructors {
    public static void main(String[] args) {

        Cons con = new Cons();
        // Whenever the object is created the constructor is called.
    }
}
