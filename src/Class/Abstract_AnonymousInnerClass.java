package Class;


abstract class abs {
    public void inAbstract() {
        System.out.println("In abstractClass");
    }
}

public class Abstract_AnonymousInnerClass {
    public static void main(String[] args) {
        abs obj = new abs() {
            public void inAbstract() {
                System.out.println("In Abstract_AnonymousInnerClass");
            }
        };

        obj.inAbstract();
    }
}