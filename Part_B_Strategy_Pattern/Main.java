public class Main {

    public static void main(String[] args) {

        Order order = new Order("ORD-1001", 5.0);

        prln("1. Standard Shipping");
        order.setShippingStrategy(new StandardShipping());
        order.displayShippingDetails();

        prln("\n2. Express Shipping");
        order.setShippingStrategy(new ExpressShipping());
        order.displayShippingDetails();

        prln("\n3. International Shipping");
        order.setShippingStrategy(new InternationalShipping());
        order.displayShippingDetails();
    }

    //Print Mathodes;

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void pr(Object anyObject) {
        System.out.print(anyObject);
    }



}