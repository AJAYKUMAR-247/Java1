package Class;

public class Class {
    public static void main(String[] args){
        Student student = new Student();

        System.out.println("studentName: "+student.name);
        System.out.println("studentRollno: "+student.rollno);
        System.out.println("studentMarks: "+student.marks);

        String name = student.student("Ajay");
        System.out.println("The name is: "+ name);
    }
    static class Student{

        //Instance Varaibles

        //These are instantiated when a object is created and destroyed when object is destroyed.
        // They have their own default values like : 0 for numbers

        int rollno = 99;
        String name = "Ajay";
        float marks = 89.9f;

        String student(String name){
            return name;
        }

    }
}
