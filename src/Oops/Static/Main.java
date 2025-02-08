package Oops.Static;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(35, "Kunal", true);
        Human Ajay = new Human(21, "Ajay", false);

        System.out.println(kunal.name + "  " + kunal.age + "  " + Human.population);
        System.out.println(kunal.name + "  " + kunal.age + "  " + kunal.population);
        System.out.println(Human.population);

    }
}
