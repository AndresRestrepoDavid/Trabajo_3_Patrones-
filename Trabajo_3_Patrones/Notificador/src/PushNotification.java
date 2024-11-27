public class PushNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando notificación push: " + message);
    }
}
