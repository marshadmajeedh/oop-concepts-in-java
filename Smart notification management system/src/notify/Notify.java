package notify;

import users.User;

public interface Notify {
    void sendNotify(User user, String message);
}
