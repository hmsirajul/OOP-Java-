// =====================================================
// State Interface
// =====================================================
// This interface defines the behavior that every state
// of the Order must implement.

interface OrderState {

    void processOrder();

    void cancelOrder();
}


// =====================================================
// Context Class
// =====================================================
// Order is the Context.
// It maintains the current state and delegates the
// behavior to that state.

class Order {

    // Current state of the order
    private OrderState state;


    // Constructor
    public Order() {

        // Initially, the order is Pending
        state = new PendingState();
    }


    // Change the current state
    public void setState(OrderState state) {

        this.state = state;
    }


    // Process the order
    public void processOrder() {

        state.processOrder();
    }


    // Cancel the order
    public void cancelOrder() {

        state.cancelOrder();
    }
}


// =====================================================
// Concrete State 1: Pending
// =====================================================

class PendingState implements OrderState {

    @Override
    public void processOrder() {

        System.out.println("Order is pending.");
        System.out.println("Order has been shipped.");

        // Change state from Pending to Shipped
        // We need the current Order object to do this,
        // so this simple version will be demonstrated
        // through the Main class.
    }


    @Override
    public void cancelOrder() {

        System.out.println("Order cancelled successfully.");
    }
}


// =====================================================
// Concrete State 2: Shipped
// =====================================================

class ShippedState implements OrderState {

    @Override
    public void processOrder() {

        System.out.println("Order has been shipped.");
        System.out.println("Order is now delivered.");
    }


    @Override
    public void cancelOrder() {

        System.out.println("Cannot cancel. Order has already been shipped.");
    }
}


// =====================================================
// Concrete State 3: Delivered
// =====================================================

class DeliveredState implements OrderState {

    @Override
    public void processOrder() {

        System.out.println("Order has already been delivered.");
    }


    @Override
    public void cancelOrder() {

        System.out.println("Cannot cancel. Order has already been delivered.");
    }
}


// =====================================================
// Main Class
// =====================================================

public class Main {

    public static void main(String[] args) {

        // Create an Order
        Order order = new Order();


        // ---------------------------------------------
        // Pending State
        // ---------------------------------------------

        System.out.println("===== PENDING STATE =====");

        order.processOrder();

        order.cancelOrder();


        // ---------------------------------------------
        // Shipped State
        // ---------------------------------------------

        System.out.println("\n===== SHIPPED STATE =====");

        order.setState(new ShippedState());

        order.processOrder();

        order.cancelOrder();


        // ---------------------------------------------
        // Delivered State
        // ---------------------------------------------

        System.out.println("\n===== DELIVERED STATE =====");

        order.setState(new DeliveredState());

        order.processOrder();

        order.cancelOrder();
    }
}