package concreteclasses;
import logger.Logger;
import users.User;

public class ConsoleLogger implements Logger {
    @Override
    public void log(User user, String message) {
        System.out.println("Console logger,logged user: " +user.getName());
        System.out.println("The message sent : "+message);
    }
}
