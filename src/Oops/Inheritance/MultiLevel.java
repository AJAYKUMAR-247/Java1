package Oops.Inheritance;

public class MultiLevel extends BoxWeight {
    double price;

    MultiLevel() {
        super();
        this.price = -1;
    }

    //if you want to access the properties of the parent class, Make sure that is available in the parent class.
    MultiLevel(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }

    public MultiLevel(Box old, double weight, double price) {
        super(old, weight);
        this.price = price;
    }

    public MultiLevel(double weight, long Weight, double price) {
        super(weight, Weight);
        this.price = price;
    }

    public MultiLevel(double price) {
        this.price = price;
    }

    public MultiLevel(double h, double w, double l, double weight, double price) {
        super(h, w, l, weight);
        this.price = price;
    }

    public MultiLevel(double weight, double price) {
        super(weight);
        this.price = price;
    }
}
