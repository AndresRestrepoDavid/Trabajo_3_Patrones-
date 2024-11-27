import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<NotificationStrategy> notificationStrategies = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addNotificationStrategy(NotificationStrategy strategy) {
        notificationStrategies.add(strategy);
    }

    public void notify(String message) {
        for (NotificationStrategy strategy : notificationStrategies) {
            strategy.sendNotification(message);
        }
    }
}
