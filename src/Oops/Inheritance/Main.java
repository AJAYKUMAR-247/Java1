package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.h);

        Box cube = new Box(5.5);
        System.out.println(cube.h + " " + cube.l + " " + cube.w);

        Box Box3 = new Box(5.6, 6.7, 7.8);
        System.out.println(Box3.h + " " + Box3.w + " " + Box3.l);

        Box OldBox = new Box(Box3);
        System.out.println(OldBox.h + " " + OldBox.w + " " + OldBox.l);

        BoxWeight WeightBox = new BoxWeight(20);
        System.out.println(WeightBox.weight + " " + WeightBox.w);

        BoxWeight Box1 = new BoxWeight(5, 6, 7, 8);
        System.out.println(Box1.weight + " " + Box1.w + " " + Box1.h + " " + Box1.l);

        //The Object which we're creating will access the properties of the reference type not th constructor type.
        Box box3 = new BoxWeight(23, 343, 45, 466);
//        System.out.println(box3.h+" " + box3.w+ " " + box.h + " "+ box3.weight);
        //Here if you try to access the weight of the box which is declared in the child class is not possible,
        //why because the hierarchy of the class is low to high.So that the parent class can't able to access the
        //properties of the child class


        //Reverse
//        BoxWeight box4 = new Box();
        //In this scenario, the reference class is child, so that you know you can access the properties of the child.
        //As we know, to access the properties, we have to initialize it first
        //but here it is not initialized in the parent class, so parent cannot be a constructor type, when child is reference type.

        //MultiLevel Inheritance

        MultiLevel box12 = new MultiLevel();
        System.out.println(box12.h + " " + box12.w + " " + box12.l + " " + box12.price + " " + box12.weight);

        MultiLevel box13 = new MultiLevel(2, 3, 5, 6, 7);
        System.out.println(box13.h + " " + box13.w + " " + box13.l + " " + box13.price + " " + box13.weight);


//        _____________________________________________________________

        Box box23 = new BoxWeight();
        // Here the reference type of the object is Box(parent class), and the object type is of object class,
        // So whatever we're tring to access should from the child class

        box23.greeting();
        // Here this will gonna return the method from the parent class, why becasue static doesn't depends
        // on the object so it is calling from the reference type only.
        //Static methods are resolved at compile-time based on the reference type, not the object type.
        //Static methods do not follow runtime polymorphism (method overriding).


        //Overriding depends on object, but static does not depends on object, that's why you can't override static stuff
    }
}
