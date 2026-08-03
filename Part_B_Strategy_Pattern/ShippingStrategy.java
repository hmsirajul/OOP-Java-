public interface ShippingStrategy {
    double calculateShippingCost(double weight);
    String getShippingMethod();
}
