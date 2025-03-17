package GarbageCollecter;

class Resource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource is closed");
    }
}

public class GarbageCollecter {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            System.out.println("Using resource");
        }
    }
}
