public class ConstructorClass {
    public static void main(String[] args){

        Student Std = new Student();
        System.out.println("Std: "+Std.rollno + "  " + Std.marks + "  " + Std.name);
        String changedName1 = Std.changeName("AjayKumar");
        System.out.println(changedName1 + "  ChangedName");

        Student Std1 = new Student(99,"Ajay",99.9f);
        System.out.println("Std1: "+Std1.rollno + "  " + Std1.marks + "  " + Std1.name);
        System.out.println("ChangedName  " + changedName1);

    }
    static class Student{
        int rollno = 99;
        String name = "Ajay";
        float marks = 89.9f;

        Student(int rollno,String name,float marks){
            this.rollno = rollno;
            this.name=name;
            this.marks=marks;
        }

        String changeName(String name){
            return this.name = name;
        }

        Student() {
            int rollno = 69;
            name = "Kumar";
            float marks = 99.0f;
        }
    }
}
