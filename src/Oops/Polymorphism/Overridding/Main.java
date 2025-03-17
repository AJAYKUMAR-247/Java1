package Oops.Polymorphism.Overridding;

//Runtime or dynamic polymorphism
// (Overridding) This is achieved by Dynamic methos Dispatch. That is why this is called Dynamic Polymorphism.

/*  If the reference type of object is parent and the object type is of child then, this is called as upcasting.
* Eg : parent obj = new child();
*
* which obj to access is determined by the dynamic dispatch method during the runtime of the program*/
public class Main {
    int num;
    public Main(int num) {
        this.num = num;
    }


    //Which toString() it is overriding is in java every class extends from the object class, here our
    //Main class also extends from the object class, it is overriding that toString().
    //This will be decided durind the run time.
    @Override
    public String toString() {
        return "Main{" +
                "num=" + num +
                '}';
    }

    //if i add final to a method, it can't be overridden.
    //Overriding is determined during the run time of the program, so it is also called as late binding, but
    //if you add final to a method, a call to be resolved it is only during the compile time, this is called as early binding.

    public static void main(String[]args) {
        Main obj = new Main(6);

        System.out.println(obj);
        //Everytime when we try to print the obj it is printing it, how ?
        //How because, println --> valueof() --> obj.toString()

        // Here for the obj, we dont have any toString(), then how it is called, --> every class is inherited from
        // object class(default object class), here that every class is Main class.
    }
}


