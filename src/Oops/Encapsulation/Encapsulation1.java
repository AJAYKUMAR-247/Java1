package Oops.Encapsulation;

// Encapsulation means hiding the data from the outside world, to access those data, we have to access it through the methods

class Human {
    private int age; // To stop, accessing of the properties you have to declare it with a private variable.
    // If it is declared as private it can be accessible only inside that class
    private String name;

    // To access those properties of a class create a method with any name
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

}


public class Encapsulation1 {
    public static void main(String[] args) {

        Human h1 = new Human();
        h1.setAge(21);
        h1.setName("Ajay");

        System.out.println(h1.getName() + " : " + h1.getAge());
    }
}
