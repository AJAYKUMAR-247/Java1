package Oops.Static;

public class StaticBlock {
    static int a = 10;
    int b = 20;
    static int c;


    //this is called static block
    //Will run only once when the first object is created, i.e.. when the class is loaded for the first time.
    static {
        System.out.println("I'm a static block");
        c = 4 * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + StaticBlock.c);

        int s = obj.b;
        System.out.println("This is non-static variable inside a static method : " + s);

        StaticBlock.c += 5;
        System.out.println(StaticBlock.a + StaticBlock.c);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + StaticBlock.c);
    }
}
