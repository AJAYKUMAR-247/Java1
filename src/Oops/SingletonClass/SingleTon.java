package Oops.SingletonClass;

public class SingleTon {
    // If you want to create a class which is going to return only one object, use singleton class

    //You dont want to create a object of the class, so you should not allow the constructor to create it,make it private.
    private SingleTon() {

    }

    private static SingleTon instance;

    // To create a single object for the class, create a method which is going to return a Singleton type of data.
    public static SingleTon instance() {
        if (instance == null) {
            instance = new SingleTon();
        }

        return instance;
    }
}
