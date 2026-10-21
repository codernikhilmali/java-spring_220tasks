public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    public void intiateNotificationSystem()
    {
        notificationService.intiateNotificationSystem();
    }
    
}
