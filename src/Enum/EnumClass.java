package Enum;

// By default laptops is a class. All enums are a class which is extending from the enum class
enum laptops {
    MacBook(2000), XPS(3000), ThinkPad(1500), Windows(1800);
    // The above are the objects of a enum class

    laptops() { // This is the default constructor
        this.price = 500;
    }

    laptops(int price) { // This is the parameterized constructor
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;


}

public class EnumClass {
    public static void main(String[] args) {
        laptops lap = laptops.Windows;
        System.out.println(lap);

        for (laptops laps : laptops.values()) {
            System.out.println(laps);
        }

        System.out.println(lap.getPrice());
        lap.setPrice(400);

    }


}
