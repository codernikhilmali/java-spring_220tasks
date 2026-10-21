public class Order {
    
    private final int orderId;

    private final double amount;

    PaymentMethod paymentMethod;

    public Order(int orderId, double amount, PaymentMethod paymentMethod)
    {
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void intiateOrder()
    {
        System.out.println(" order processing intiated for id = "+orderId);
        System.out.println("processing amout = "+amount);
        paymentMethod.displayProviderName();
        paymentMethod.processPayment();
    }
}
