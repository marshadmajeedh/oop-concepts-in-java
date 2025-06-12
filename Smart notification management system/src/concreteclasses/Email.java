package concreteclasses;

import notify.Notify;
import users.User;

public class Email implements Notify {
    @Override
    public void sendNotify(User user, String message) {
        System.out.println("Email sent to " +user.getName());
        System.out.println("The mail is: " + message);
    }
}
