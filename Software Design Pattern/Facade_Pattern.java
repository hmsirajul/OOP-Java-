// =====================================================
// Subsystem 1: Inventory
// =====================================================
// Responsible for checking product availability.

class Inventory {

    public boolean checkProduct(String product) {

        System.out.println("Checking product availability: " + product );

        // Assume product is available
        return true;
    }
}


// =====================================================
// Subsystem 2: Payment
// =====================================================
// Responsible for processing payment.

class Payment {

    public void makePayment(double amount) {

        System.out.println( "Payment processed: $" + amount );
    }
}


// =====================================================
// Subsystem 3: Delivery
// =====================================================
// Responsible for arranging delivery.

class Delivery {

    public void arrangeDelivery(String address) {

        System.out.println( "Delivery arranged to: " + address );
    }
}


// =====================================================
// Subsystem 4: Notification
// =====================================================
// Responsible for sending order confirmation.

class Notification {

    public void sendConfirmation(String product) {

        System.out.println(  "Order confirmation sent for: " + product );
    }
}


// =====================================================
// Facade Class
// =====================================================
// OrderFacade provides one simple method to the client.
//
// It hides the complexity of Inventory, Payment,
// Delivery and Notification.

class OrderFacade {

    // Create subsystem objects
    private Inventory inventory;
    private Payment payment;
    private Delivery delivery;
    private Notification notification;


    // Constructor
    public OrderFacade() {

        inventory = new Inventory();
        payment = new Payment();
        delivery = new Delivery();
        notification = new Notification();
    }


    // -------------------------------------------------
    // Simple method for the client
    // -------------------------------------------------
    public void placeOrder(
            String product,
            double amount,
            String address) {


        // Step 1: Check product
        boolean available = inventory.checkProduct(product);


        if (!available) {

            System.out.println( "Product is not available." );

            return;
        }


        // Step 2: Process payment
        payment.makePayment(amount);


        // Step 3: Arrange delivery
        delivery.arrangeDelivery(address);


        // Step 4: Send confirmation
        notification.sendConfirmation(product);


        System.out.println( "Order placed successfully!");
    }
}


// =====================================================
// Main Class
// =====================================================

public class Main {

    public static void main(String[] args) {

        // Create Facade
        OrderFacade orderFacade = new OrderFacade();


        // Client only calls ONE method.
        orderFacade.placeOrder(  "Laptop",  1200,   "Dhaka, Bangladesh" );
    }
}