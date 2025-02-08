package Oops.Static;


public class InnerClass {

    //Now the variable is directly dependent on the class, so all the objects have the same name,
    //which is declared last(means the last one will override the previous one)
    static String Name;

    public InnerClass(String Name) {
        InnerClass.Name = Name;
    }


    // A Clas inside a class is known as innerclass.
    //If i try to access it inside a static method it will throw a error, why because the class itself depends
    //on the outerclass, so if you want to access a class inside class make the innerClass as static.
    static class Test1 {
        String name;

        public Test1(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test1 obj = new Test1("Kunal");
        Test1 obj2 = new Test1("Rahul");

        //we know that if any this declared as static then it will the same for all the objects in that class.
        //Then why here both the object can have different name, why because here the class itself static
        //not the name which is declared inside the class.
        System.out.println("obj1: " + obj.name + " " + "obj2: " + obj2.name);

        //static Name
        InnerClass objj = new InnerClass("kunal");
        InnerClass objj2 = new InnerClass("Rahul");


        //Here the Name of all the objects of the class will be same.
        System.out.println("objj: " + objj.Name + "    objj2: " + objj2.Name);

    }
}
