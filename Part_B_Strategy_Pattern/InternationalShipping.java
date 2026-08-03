public class InternationalShipping implements ShippingStrategy {

    private static final double BASE_COST = 20.00;
    private static final double COST_PER_KG = 8.00;

    public double calculateShippingCost(double weight) {
        return BASE_COST + (weight * COST_PER_KG);
    }

    public String getShippingMethod() {
        return "International Shipping";
    }
}