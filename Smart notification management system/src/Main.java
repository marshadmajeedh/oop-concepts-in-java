import concreteclasses.*;
import logger.Logger;
import notify.Notify;
import service.LogService;
import service.NotificationService;
import service.UserService;
import users.AdminUser;
import users.User;
import users.MemberUser;

public class Main {
    public static void main(String[] args) {

        Notify[] notifies = {
                new Email(),
                new SMS(),
                new Push()
        };

        Logger[] loggers = {
                new FileLogger(),
                new ConsoleLogger()
        };

        User[] users = {
                new AdminUser("marshad", "Admin"),
                new MemberUser("Maisha", "Member")
        };

        System.out.println ("User details : ");
        UserService us = new UserService(users);
        us.printDetails();

        System.out.println ("Notification details : ");
        NotificationService ns = new NotificationService(notifies);
        ns.notify(users[0],"Hi marshad");

        System.out.println ("Logger details : ");
        LogService ls = new LogService(loggers);
        ls.log(users[1],"Hi maisha");

    }
}
