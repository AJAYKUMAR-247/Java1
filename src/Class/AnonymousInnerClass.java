package Class;

class A {
    public void show() {
        System.out.println("In class a");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        A a = new A() {

            // If you want a create a class for one time use, you dont want to create a new class for it.
            // Instead you can create a new anonymous class
            public void show() {
                System.out.println("In Anonymous Class");
            }
        };

        a.show();
    }
}