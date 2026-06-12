//An E-Commerce System processes customer orders.
// 1. Define a custom exception OutOfStockException that is thrown when a product is out of stock.
// 2. Create a class Product with:
//  a. Attributes for name, stock, and a method purchase(int quantity) that checks availability and throws an exception if the stock is insufficient.
// 3. Implement exception handling in a main method.
// Task: Simulate an order placement where a user tries to buy a product that is out of stock.
// Note: Try to include exception handling code wherever possible.

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    String name;
    int stock;

    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    void purchase(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Product " + name + " is out of stock. Available stock: " + stock);
        } else {
            stock -= quantity;
            System.out.println("Purchased " + quantity + " of " + name + ". Remaining stock: " + stock);
        }
    }
}

public class ass8 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 5);

        try {
            product.purchase(3); // Successful purchase
            product.purchase(3); // This will throw an exception
        } catch (OutOfStockException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
