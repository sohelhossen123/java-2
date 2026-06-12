//An e-commerce platform wants to integrate multiple payment gateways.
// 1. Define an interface UPIPayment with a method payViaUPI().
// 2. Define another interface CardPayment with a method payViaCard().
// 3. Implement a class OnlinePayment that inherits both interfaces and provides functionality to process both UPI and Card payments.
// Task: Implement the system and simulate payment processing for both UPI and card transactions.
// Note: Try to include exception handling code wherever possible.

interface UPIPayment {
    void payViaUPI(double amount) throws Exception;
}

interface CardPayment {
    void payViaCard(double amount) throws Exception;
}

class OnlinePayment implements UPIPayment, CardPayment {
    @Override
    public void payViaUPI(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount for UPI payment.");
        }
        System.out.println("Processing UPI payment of Rs." + amount);
        // Simulate payment processing logic here
        System.out.println("UPI payment successful!");
    }

    @Override
    public void payViaCard(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount for card payment.");
        }
        System.out.println("Processing card payment of Rs." + amount);
        // Simulate payment processing logic here
        System.out.println("Card payment successful!");
    }
}

public class ass5 {
    public static void main(String[] args) {
        OnlinePayment payment = new OnlinePayment();
        
        try {
            payment.payViaUPI(100.0);
            payment.payViaCard(200.0);
        } catch (Exception e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
        
        try {
            payment.payViaUPI(-50.0); // This will throw an exception
        } catch (Exception e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
        
        try {
            payment.payViaCard(-150.0); // This will also throw an exception
        } catch (Exception e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }
}
