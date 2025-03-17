package GarbageCollecter;

class MyClass {
    void cleanup() {
        System.out.println("Cleaning up resources");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.cleanup();  // Manually invoke cleanup
    }
}

