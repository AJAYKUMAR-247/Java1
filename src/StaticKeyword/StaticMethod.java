package StaticKeyword;

class Phone {
    int price;
    String name;
    static String modal = "Mobile";

    //Non-static method
    public void show() {
        System.out.println("Mobile name : " + name + " Mobile modal : " + modal);
    }

    public static void show1() {

        // Inside a static method, you cant access a non-static variables, because non-static variables belongs to object, so you can't say to take which objects properties.
        System.out.println("Mobile modal : " + modal);
    }

    // To access a non-static variable inside a static method will be possible if you pass a object reference.
    public static void show2(Phone obj) {
        System.out.println("Mobile modal : " + modal + " Mobile name : " + obj.name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        Phone ph1 = new Phone();
        ph1.name = "Apple";


        Phone ph2 = new Phone();
        ph2.name = "SamSung";

        // If it is a non-static method, you can only able to access it through a object reference.
        ph1.show();
        ph2.show();

        // But, if it a static mwthod, you dont want object reference you can call the method through class reference.
        Phone.show1();
        Phone.show2(ph1);

    }
}
