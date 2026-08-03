public class ExpressShipping implements ShippingStrategy {

    private static final double BASE_COST = 10.00;
    private static final double COST_PER_KG = 4.00;

    public double calculateShippingCost(double weight) {
        return BASE_COST + (weight * COST_PER_KG);
    }

    public String getShippingMethod() {
        return "Express Shipping";
    }
}