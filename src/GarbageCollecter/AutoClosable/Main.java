package GarbageCollecter.AutoClosable;
//
class Resourse implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource is closed");
    }
}

public class Main{
    public static void main(String[] args) {
        try (Resourse resourse = new Resourse()) {
            System.out.println("Using Resource");
        }
    }
}


//class Resource implements AutoCloseable {
//    @Override
//    public void close() {
//        System.out.println("Resource is closed");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        try (Resource resource = new Resource()) {
//            System.out.println("Using resource");
//        }
//    }
//}
