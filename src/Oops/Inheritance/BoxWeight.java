package Oops.Inheritance;

public class BoxWeight extends Box {

    double weight;

    static void greeting(){
        System.out.println("Hi, I'm from the Box class");
    }

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double h, double w, double l, double weight) {
        super(h, w, l);
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

    //Super keyword has two uses,
    //1. To access the properties of the parent class.
    //2. super() is a constructor

    // If you have the same property in both child and parent class(eg weight)
    public BoxWeight(double weight, long Weight) {
        super.weight = weight;//this will access the weight from the parent class
        this.weight = weight;// This will access the weight from this class.
    }
}
