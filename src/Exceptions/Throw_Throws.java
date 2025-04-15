package Exceptions;

public class Throw_Throws {
    public static void main(String[] args) {
        int i = 20;

        try {
            int j = 18 / i;
            //Generally it is used to throw a exception.
            if (j == 0) throw new ArithmeticException("I should not be zero");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
