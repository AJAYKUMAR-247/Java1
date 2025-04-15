package Exceptions;

class Custom extends RuntimeException {

    public Custom() {

    }

    public Custom(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 20;

        try {
            int j = 18 / 20;
            if (j == 0) throw new Custom("I should not be zero");
        } catch (Custom e) {
            System.out.println(e);
        }
    }
}
