// An online shopping platform supports different payment methods like Credit Card and PayPal. Each payment method should:
// 1. Have a transaction ID, amount, and a method to process the payment.
// 2. Implement different payment processing mechanisms:
// a. Credit Card: Charge 2% transaction fee.
// b. PayPal: Charge 3% transaction fee.
// Design an abstract class Payment and implement its subclasses (CreditCardPayment, PayPalPayment).
// Write a Java program to process payments.
// Note: Try to include exception handling code wherever possible.

abstract class Payment {
    protected String transactionId;
    protected double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public abstract void processPayment() throws Exception;
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void processPayment() throws Exception {
        if (amount <= 0) {
            throw new Exception("Amount must be greater than zero.");
        }
        double transactionFee = amount * 0.02;
        double totalAmount = amount + transactionFee;
        System.out.println("Processing Credit Card Payment:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: Rs." + amount);
        System.out.println("Transaction Fee: Rs." + transactionFee);
        System.out.println("Total Amount: Rs." + totalAmount);
    }
}

class PayPalPayment extends Payment {
    public PayPalPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void processPayment() throws Exception {
        if (amount <= 0) {
            throw new Exception("Amount must be greater than zero.");
        }
        double transactionFee = amount * 0.03;
        double totalAmount = amount + transactionFee;
        System.out.println("Processing PayPal Payment:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: Rs." + amount);
        System.out.println("Transaction Fee: Rs." + transactionFee);
        System.out.println("Total Amount: Rs." + totalAmount);
    }
}

public class ass3 {
    public static void main(String[] args) {
        try {
            Payment creditCardPayment = new CreditCardPayment("CC12345", 100.00);
            creditCardPayment.processPayment();

            System.out.println();

            Payment payPalPayment = new PayPalPayment("PP54321", 150.00);
            payPalPayment.processPayment();
        } catch (Exception e) {
            System.out.println("Error processing payment: " + e.getMessage());
        }
    }
}

