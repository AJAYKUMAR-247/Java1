package Interfaces.basic;


class Interfaces implements Interface {
    public void show() {
        System.out.println("In show method");
    }

    public void displayName() {
        System.out.println("In displayName method");
    }
}

class Interface2 implements X {

    public void show() {
        System.out.println("In X show ");
    }

    public void displayName() {
        System.out.println("In X displayname");
    }
}

public class Interfacess {
    public static void main(String[] args) {
        Interfaces obj = new Interfaces();

        obj.displayName();
        obj.show();

        Interface.staticMethod();
        obj.defaultMethod();

        Interface2 obj1 = new Interface2();

        obj1.displayName();
        obj1.show();

//        X.staticMethod(); This is not, possible because we cant access the static methods in a child interface
        obj1.defaultMethod();
    }
}
