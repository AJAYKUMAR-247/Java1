package Oops.Polymorphism.OverLoading;

public class Numbers {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

//    int sum(int a, int b){ The parameters types and the count of the parameters sholud not be same.
//        return a+b;
//    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

