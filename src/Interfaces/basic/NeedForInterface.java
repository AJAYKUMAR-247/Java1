package Interfaces.basic;


interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("In laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("In Desktop");
    }
}

class Developer {
    public void develop(Computer com) {
        System.out.println("I'm Developer");
        com.code();
    }
}

public class NeedForInterface {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        Developer dev = new Developer();
        dev.develop(lap);
        dev.develop(desk);
    }
}
