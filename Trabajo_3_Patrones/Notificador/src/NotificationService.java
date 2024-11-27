import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<User> users = new ArrayList<>();

    public void subscribe(User user) {
        users.add(user);
    }

    public void unsubscribe(User user) {
        users.remove(user);
    }

    public void notifyAllUsers(String message) {
        for (User user : users) {
            user.notify(message);
        }
    }
}
