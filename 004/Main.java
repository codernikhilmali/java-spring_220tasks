public class Main
{
    public static void main(String[] args) {
        
        EmailNotification emailNotification = new EmailNotification("nikhil mali", "email notifications sent");
        SmsNotification smsNotification = new SmsNotification("nikhil mali", "SMS notifications sent");
        PushNotification pushNotification = new PushNotification("nikhil mali", "Push notifications sent");

        NotificationManager notificationManager1 = new NotificationManager(pushNotification);
        NotificationManager notificationManager2 = new NotificationManager(emailNotification);
        NotificationManager notificationManager3 = new NotificationManager(smsNotification);

        notificationManager1.intiateNotificationSystem();
        notificationManager2.intiateNotificationSystem();
        notificationManager3.intiateNotificationSystem();
    }
}