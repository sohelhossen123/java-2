// Develop an Online Shopping System with:
// Product (Base class) containing productName and price.
// Electronics (Intermediate class) inheriting Product and adding warrantyPeriod.
// Smartphone (Derived class) inheriting Electronics and adding batteryLife.
// Tasks:
// 1. Implement multilevel inheritance.
// 2. Create a method to display product details.
// 3. Demonstrate object instantiation and display the product hierarchy.
// Note: Try to include exception handling code wherever possible.

class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product {
    int warrantyPeriod; // in months

    public Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

class Smartphone extends Electronics {
    int batteryLife; // in hours

    public Smartphone(String productName, double price, int warrantyPeriod, int batteryLife) {
        super(productName, price, warrantyPeriod);
        this.batteryLife = batteryLife;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}

public class ass2 {
    public static void main(String[] args) {
        try {
            Smartphone smartphone = new Smartphone("iPhone 13", 999.99, 24, 20);
            smartphone.displayDetails();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}