public class CreditCardPayment extends PaymentMethod{
    
    public CreditCardPayment(String provider)
    {
        super(provider);
    }

    @Override 
    public void processPayment()
    {
        System.out.println("Current payment method is Credit card");
        System.out.println("Payment successfull");
    }
}
