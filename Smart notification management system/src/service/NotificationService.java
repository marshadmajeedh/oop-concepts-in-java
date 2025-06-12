package service;

import notify.Notify;
import users.User;

public class NotificationService {
    private Notify[] notifies;
    public NotificationService(Notify[] notifies) {
        this.notifies = notifies;
    }

    public void notify(User user, String message) {
        for (Notify notif : notifies) {
            notif.sendNotify(user, message);
            System.out.println();
        }
    }
}
