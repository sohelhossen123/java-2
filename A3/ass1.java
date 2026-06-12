// Design a Vehicle Management System where:
// Vehicle (Base class) contains attributes like brand, model, and year.
// Car (Intermediate class) inherits Vehicle and adds fuelType (Petrol/Diesel/Electric).
// LuxuryCar (Derived class) inherits Car and adds feature (Sunroof/Leather Seats/Autopilot).
// Tasks:
// 1. Implement multilevel inheritance using the given classes.
// 2. Create objects and demonstrate the working of constructors.
// 3. Override a method in the child class to display details of LuxuryCar.
// Note: Try to include exception handling code wherever possible.

class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class LuxuryCar extends Car {
    String feature;

    LuxuryCar(String brand, String model, int year, String fuelType, String feature) {
        super(brand, model, year, fuelType);
        this.feature = feature;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Feature: " + feature);
    }
}

public class ass1 {
    public static void main(String[] args) {
        try {
            LuxuryCar luxuryCar = new LuxuryCar("Tesla", "Model S", 2022, "Electric", "Autopilot");
            luxuryCar.displayDetails();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

