package concreteclasses;

import notify.Notify;
import users.User;

public class Push implements Notify {
    @Override
    public void sendNotify(User user, String message) {
        System.out.println("Push sent to " +user.getName());
        System.out.println("The push is: " + message);
    }
}
