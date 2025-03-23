package Array;

import java.util.Scanner;

class Student {
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    int rollNo;
    String name;
    double marks;


}

public class ArrayofObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student("Ajay", 3, 98.9);
        Student student2 = new Student("Arun", 6, 99.9);
        Student student3 = new Student("Augu", 7, 99.9);

        Student[] student = {student1, student2, student3};

        // To create a Array of class student

        Student[] studentArray = new Student[3];

//        for (int i = 0; i < studentArray.length; i++) {
//            studentArray[i] = student[i];
//        }

        // To copy a array to an another array, there is an effective way to do it.
        //System.arraycopy(sourceArray, index to start from, DestinationArray, index to start from,Number of elements to copy)

        System.arraycopy(student, 0, studentArray, 0, studentArray.length);

        for (Student stu : studentArray) {
            System.out.println("Sytudent name :" + stu.name);
        }
    }
}
