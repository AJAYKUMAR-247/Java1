package StaticKeyword;

class Mobile {
    int price; //Instance variable which belongs to the object.
    String modal;
    static String name = "Common"; // if you declare a varaible with static, it is called static variable. This belongs to the class, static does not depends on the object.

    public void show() {
        System.out.println("Mobile name " + name + "Mobile modal " + modal);
    }
}

public class StaticVariable {
    public static void main(String[] args) {

        Mobile mbl1 = new Mobile();
        mbl1.name = "mbl1 "; // if you want to access static variable don't access it through obj name, instead access it through class variable
        mbl1.modal = "Apple";

        Mobile mbl2 = new Mobile();
        System.out.println(Mobile.name);
        mbl2.modal = "Samsung";

        mbl1.show();
        mbl2.show();  // For both mobiles the name is changed why because, you have changed the value of static variable, which does not belongs to object,
        // so it changes the class variable value.

    }
}
