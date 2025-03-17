package Oops.Polymorphism.Poly;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();

        Square square = new Square();
        square.area();

        Circle circle = new Circle();
        circle.area();
    }
}

