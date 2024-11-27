
 class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        User user1 = new User("Alice");
        user1.addNotificationStrategy(new EmailNotification());
        user1.addNotificationStrategy(new SMSNotification());

        User user2 = new User("Bob");
        user2.addNotificationStrategy(new PushNotification());

        notificationService.subscribe(user1);
        notificationService.subscribe(user2);

        Command sendNotification = new SendNotificationCommand(notificationService, "Hola, tienes un nuevo mensaje!");
        sendNotification.execute();
    }
}