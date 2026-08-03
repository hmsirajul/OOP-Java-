public class Order {
    private final String orderId;
    private final double weight;
    private ShippingStrategy shippingStrategy;
    public Order(String orderId, double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Order weight must be greater than zero.");
        }
        this.orderId = orderId;
        this.weight = weight;
    }
    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        if (shippingStrategy == null) {
            throw new IllegalArgumentException("Shipping strategy cannot be null.");
        }
        this.shippingStrategy = shippingStrategy;
        prln("Shipping method changed to: " + shippingStrategy.getShippingMethod());
    }
    public double calculateShippingCost() {
        if (shippingStrategy == null)
        {
            throw new IllegalStateException("Please select a shipping strategy first.");
        }
        return shippingStrategy.calculateShippingCost(weight);
    }

    public void displayShippingDetails() {
        double shippingCost = calculateShippingCost();
        prln("Order ID: " + orderId);
        prln("Weight: " + weight + " kg");
        prln("Shipping method: " + shippingStrategy.getShippingMethod());
        pr("Shipping cost: $%.2f%n", shippingCost);
    }


    //Print Mathodes;

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void pr(Object anyObject) {
        System.out.print(anyObject);
    }
}
