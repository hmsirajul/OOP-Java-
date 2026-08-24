// =====================================================
// Strategy Interface
// =====================================================
// Defines a common method for all payment strategies.

interface PaymentStrategy {

    void pay(double amount);
}


// =====================================================
// Concrete Strategy 1: Credit Card
// =====================================================

class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid " + amount + " using Credit Card."
        );
    }
}


// =====================================================
// Concrete Strategy 2: bKash
// =====================================================

class BkashPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid " + amount + " using bKash."
        );
    }
}


// =====================================================
// Concrete Strategy 3: PayPal
// =====================================================

class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid " + amount + " using PayPal."
        );
    }
}


// =====================================================
// Context Class
// =====================================================
// The PaymentContext uses a selected payment strategy.

class PaymentContext {

    private PaymentStrategy strategy;


    // Set the payment strategy
    public void setPaymentStrategy(PaymentStrategy strategy) {

        this.strategy = strategy;
    }


    // Perform payment using the selected strategy
    public void makePayment(double amount) {

        strategy.pay(amount);
    }
}


// =====================================================
// Main Class
// =====================================================

public class Main {

    public static void main(String[] args) {

        // Create Payment Context
        PaymentContext payment = new PaymentContext();


        // ---------------------------------------------
        // Pay using Credit Card
        // ---------------------------------------------

        payment.setPaymentStrategy(
            new CreditCardPayment()
        );

        payment.makePayment(5000);


        // ---------------------------------------------
        // Change strategy to bKash
        // ---------------------------------------------

        payment.setPaymentStrategy(
            new BkashPayment()
        );

        payment.makePayment(2500);


        // ---------------------------------------------
        // Change strategy to PayPal
        // ---------------------------------------------

        payment.setPaymentStrategy(
            new PayPalPayment()
        );

        payment.makePayment(3000);
    }
}