public class EmailNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando correo electrónico: " + message);
    }
}
