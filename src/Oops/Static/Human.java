package Oops.Static;

public class Human {

    //these are the instance variables of the class
    int age;
    String name;
    boolean marriage;

    //this is a static reference variable why because it is common to all the objects of this class
    static long population;

    //static methods inside a class, in this static methods we can't able to use this keyword thy because
    //that is dependent on the object.

    static void displayName() {
        System.out.println("This will display the name");
//        System.out.println("Name :"+ this.name);// Here the error will come.
    }

    public Human(int age, String name, boolean marriage) {
        this.age = age;
        this.name = name;
        this.marriage = marriage;

        //Static does not depends on the objects thats why we are passing the reference as class
        Human.population += 1;
        Human.displayName();
    }
}
