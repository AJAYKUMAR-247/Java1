package Functions;

public class finaliz {
    public static void main(String[] args) {
        Student obj = new Student(1,"ajay");

        for (int i = 0; i < 1000000000; i++) {
            obj = new Student(i, "Random");
        }
    }

    static class Student {
        int rollno;
        String name;

        public Student(int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
}
