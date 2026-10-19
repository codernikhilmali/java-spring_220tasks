public abstract class PaymentMethod
{
    public String provider;

    public PaymentMethod(String provider)
    {
        this.provider = provider;
    }
    
    public void displayProviderName()
    {
        System.out.println("Current Payment provider is = "+provider);
    }

    public void processPayment()
    {
        
    }
}