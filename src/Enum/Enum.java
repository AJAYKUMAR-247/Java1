package Enum;

enum status {
    Running, pending, inProgress, completed
}


public class Enum {
    public static void main(String[] args) {
        status s = status.inProgress;
        System.out.println(s);

        status[] ss = status.values(); //this method will return a array, so we have to store it in array.

        for (status sss : ss) {
            System.out.println(sss + " : " + sss.ordinal());
        }
    }


}
