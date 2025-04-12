package Class;

class OuterClass {
    int num;

    public void InOuter() {
        System.out.println("In outer class");
    }

    class Inner {
        public void InInner() {
            System.out.println("In Inner Class");
        }
    }

    static class staticInner {
        public void InStaticInner() {
            System.out.println("In StaticInner class");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.InOuter();
        OuterClass.Inner inner = outer.new Inner();
        inner.InInner();

        OuterClass.staticInner staticInner = new OuterClass.staticInner();
        staticInner.InStaticInner();

    }
}


