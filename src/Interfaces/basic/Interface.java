package Interfaces.basic;

public interface Interface {

    void show();

    void displayName();

    static void staticMethod() {
        System.out.println("In static method");
    }

    default void defaultMethod() {
        System.out.println("In default method");
    }
}

interface X extends Interface {

}



