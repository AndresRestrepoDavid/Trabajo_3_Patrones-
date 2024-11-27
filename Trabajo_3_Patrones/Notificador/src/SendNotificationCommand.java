public class SendNotificationCommand implements Command{
    private NotificationService notificationService;
    private String message;

    public SendNotificationCommand(NotificationService notificationService, String message) {
        this.notificationService = notificationService;
        this.message = message;
    }

    @Override
    public void execute() {
        notificationService.notifyAllUsers(message);
    }
}
