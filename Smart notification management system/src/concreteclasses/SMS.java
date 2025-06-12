package concreteclasses;

import notify.Notify;
import users.User;

public class SMS implements Notify {
    @Override
    public void sendNotify(User user, String message) {
        System.out.println("SMS sent to " +user.getName());
        System.out.println("The sms is: " + message);
    }
}
