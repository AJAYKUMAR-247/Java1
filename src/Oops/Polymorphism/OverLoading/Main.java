package Oops.Polymorphism.OverLoading;

//compile time or static polymorphism
public class Main {

    // Both the overloading and the overloading or not applied to the instance variables.
    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(4, 6);
        obj.sum(4, 6, 7);
    }
}
