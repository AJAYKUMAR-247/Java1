
@FunctionalInterface
interface A {
    public void show(String name);
}

public class LambdaExpression {
    public static void main(String[] args) {

        //The syntax of Anonymous Inner Class
//        A obj = new A() {
//            public void show(String name) {
//                System.out.println();
//            }
//        };


        // Using the lambda expression, the lines of code is reduced
        A obj = name -> System.out.println("Hi i'm " + name);

        obj.show("Ajay");
    }
}
