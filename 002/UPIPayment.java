public class UPIPayment extends PaymentMethod{
    
    public UPIPayment(String provider) {
        super(provider);
    }
    
    @Override 
    public void processPayment()
    {
        System.out.println("Current payment method is UPI");
        System.out.println("Payment successfull");
    }
}
