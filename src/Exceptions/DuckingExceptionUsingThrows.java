package Exceptions;


//class A {
//    public void show() {
//        try {
//            Class.forName("DuckingExceptionUsingThrows");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//
//public class DuckingExceptionUsingThrows {
//    public static void main(String[] args) {
//
//    }
//}


// The above is the usual throw method

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("DuckingExceptionUsingThrows");
    }
}


public class DuckingExceptionUsingThrows {
    public static void main(String[] args) {
        A obj = new A();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}