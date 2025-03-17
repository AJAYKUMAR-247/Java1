package Oops.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    double weight;

    static void greeting(){
        System.out.println("Hi, I'm from the Box class");
    }

    public Box() {
        super();//Here if you want to use the super() at the parent level it will call it from the object class
        this.l = -1;
        this.h = -1;
        this.w = -1;
        this.weight = -1;
    }

    public Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public Box(double h, double w, double l) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
