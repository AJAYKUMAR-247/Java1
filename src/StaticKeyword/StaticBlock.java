package StaticKeyword;

class Phones {
    String brand;
    int price;
    static String name;

    public Phones() {
        brand = "";
        price = 200;
        // Here in the constructor i haven't set the value for the static variable, because every time the object is created it has been called again and
        // again. Anyhow it depends on the class so once class loaded it has to be set, we can achieve it through static block.
        System.out.println("In Constructor");
    }


    // This a called static block, static block will get calls only one when a class get loaded
    static {
        name = "Phone";
        System.out.println("In static block");
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Phones ph1 = new Phones();
        Phones ph2 = new Phones();

        // If you execute and see, you can see that the constructor method called two times, but the static method called only once.

        // If you notice, without creating a object of a class, the class will not get load

        // To make a class load without creating a object, there is a Class class in java
        Class.forName("Phones");// It will throw a execption handle it.

//       In that Class class there is a method which will make class load is called system class loader

    }
}
