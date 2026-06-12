// A graphics application allows users to draw different shapes like Circles and Rectangles. Each shape should:
// 1. Have a color.
// 2. Implement a method to calculate area and draw the shape.
// 3. Circle: Area = π * r2
// 4. Rectangle: Area = length * breadth
// Define an abstract class Shape with methods calculateArea() and draw(), then implement subclasses (Circle, Rectangle). 
// Write a Java program to display the areas and draw shapes.
// Note: Try to include exception handling code wherever possible.

import java.util.Scanner;
abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();
    abstract void draw();
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + color + " rectangle with length " + length + " and breadth " + breadth);
    }
}

public class ass4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter color for Circle: ");
            String circleColor = scanner.nextLine();
            System.out.print("Enter radius for Circle: ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(circleColor, radius);
            System.out.println("Area of Circle: " + circle.calculateArea());
            circle.draw();

            System.out.print("Enter color for Rectangle: ");
            scanner.nextLine(); // Consume newline
            String rectangleColor = scanner.nextLine();
            System.out.print("Enter length for Rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter breadth for Rectangle: ");
            double breadth = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(rectangleColor, length, breadth);
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
            rectangle.draw();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
