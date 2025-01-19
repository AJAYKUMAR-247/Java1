public class Swap {

    public static void main(String[] args){
        int a = 5;
        int b = 10;

        String name = "Ajay";
        String changedName = changeName(name);
        System.out.println(name);
        System.out.println(changedName);



        swap(a,b);
        System.out.println("A"+a+"B"+b);

        int[] arr = swap1(a,b);
        System.out.println("Number1 :"+ arr[0]+ " Number2:"+arr[1]);

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a"+ a + "b" + b);
    }

    static int[] swap1(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        return new int[]{num1,num2};
    }

    static String changeName(String name){
        System.out.println(name);
        name = "AK";
        return name;
    }
}
