public class PushNotification implements NotificationService{

    private final String recipient;
    private final String message;

    public PushNotification(String recipient, String message)
    {
        this.recipient  = recipient;
        this.message = message;
    }

    @Override 
    public String Recipient()
    {
        return recipient;
    }

    @Override
    public String Message() 
    {    
        return message;
    }

    @Override 
    public void intiateNotificationSystem()
    {
        System.out.println("Notification service started");
        System.out.println("notification sent to "+Recipient());
        System.out.println("message = "+Message());
    }
}