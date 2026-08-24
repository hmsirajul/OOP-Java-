// =====================================================
// Abstract Class - Template
// =====================================================
// This class defines the common steps of preparing food.
// The order of these steps cannot be changed.

abstract class Food {

    // Template Method
    // Defines the complete algorithm.
    public final void prepareFood() {

        prepareIngredients();
        cookFood();
        addToppings();
        serveFood();
    }


    // Common step
    protected void prepareIngredients() {

        System.out.println("Preparing ingredients...");
    }


    // These methods are different for each food.
    // Subclasses will provide their own implementation.

    protected abstract void cookFood();

    protected abstract void addToppings();


    // Common step
    protected void serveFood() {

        System.out.println("Serving food...");
    }
}


// =====================================================
// Concrete Class - Pizza
// =====================================================

class Pizza extends Food {

    @Override
    protected void cookFood() {

        System.out.println("Baking pizza in the oven...");
    }


    @Override
    protected void addToppings() {

        System.out.println("Adding cheese and vegetables...");
    }
}


// =====================================================
// Concrete Class - Burger
// =====================================================

class Burger extends Food {

    @Override
    protected void cookFood() {

        System.out.println("Grilling the burger...");
    }


    @Override
    protected void addToppings() {

        System.out.println("Adding lettuce, cheese and sauce...");
    }
}


// =====================================================
// Main Class
// =====================================================

public class Main {

    public static void main(String[] args) {

        // Create Pizza
        Food pizza = new Pizza();

        System.out.println("===== PIZZA =====");

        // Execute the template method
        pizza.prepareFood();


        System.out.println();


        // Create Burger
        Food burger = new Burger();

        System.out.println("===== BURGER =====");

        // Execute the same template method
        burger.prepareFood();
    }
}