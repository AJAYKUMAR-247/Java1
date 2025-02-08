package Oops.Static;

public class StaticMethods {
    public static void main(String[] args) {

        //All the nonStaticMethods are anyhow going to call inside a static method which is main..

        StaticMethods obj = new StaticMethods();
        obj.nonStaticMethod();
    }

    //static method which really does not care about object
    static void Staticmethod1() {
        System.out.println("This is Method1");

        //when you try to access a non-static method inside a static method it will not really allow you to do that.
        //Because static does not need any object, but non-static really needs a instance of the class.
        //How we can access a thing which depends on object inside a one which really indepenent on object.

        //To do that we have to create a obj(instance) of the class.

        StaticMethods mainObj = new StaticMethods();
        mainObj.nonStaticMethod();

    }

    //non-static method which requires a instance of the class to run, means you need to create a object
    //of the class to access it.
    void nonStaticMethod() {
        System.out.println("This is Non-static method");
    }

    void nonStaticMethod2() {
        System.out.println("This is nonStaticMethod2");

        //Inside a non-static method we can able to access a static method why because, it does not care whether it
        //depends on object.

        Staticmethod1();
    }

    void nonStaticMethod3() {
        System.out.println("This is nonStaticMethod3");

        //We can able to call a nonStaticMethod inside a nonStaticMethod
        //Ultimately we're going a call a nonStaticMethods inside a static method which is main.
        //At that time, for the nonStatic method we'll create a instance, that istance will be borrowed
        //by the nonStaticMethod which is inside a nonStaticMethod.

        nonStaticMethod();

    }
}
