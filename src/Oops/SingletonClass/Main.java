package Oops.SingletonClass;

public class Main {
    public static void main(String[] args) {

        //Here you cannot create a obj of the singleTon class as it is declared as private.
        SingleTon obj;

        //After creating the method to create a single object of the class, call the method here
        obj = SingleTon.instance();

        SingleTon obj2 = SingleTon.instance();

        //So that, no matter how much objects you're creating for the Singleton class, you will get the
        //same object which is created first
        SingleTon obj3 = SingleTon.instance();

    }
}
