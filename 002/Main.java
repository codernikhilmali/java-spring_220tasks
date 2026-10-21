public class Main {
    

    public static void main(String[] args) {
        
        UPIPayment upiPayment = new UPIPayment("Google Pay");
        CreditCardPayment creditCardPayment = new CreditCardPayment("rupay");

        Order order1 = new Order(1, 20000, upiPayment);
        Order order2 = new Order(2, 100000, creditCardPayment);

        order1.intiateOrder();

        order2.intiateOrder();
    }
}
