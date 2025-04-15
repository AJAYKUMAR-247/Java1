package Exceptions;

public class Exceptions {
    public static void main(String[] args) {

        int i = 0;

        int[] arr = new int[5];

        String name = null;

        try {
            int j = 18 / i;

            System.out.println(arr[5]);

            System.out.println(name.length());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException e");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
