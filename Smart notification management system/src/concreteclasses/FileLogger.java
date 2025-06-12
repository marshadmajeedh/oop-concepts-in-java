package concreteclasses;
import logger.Logger;
import users.User;

public class FileLogger implements Logger {
    @Override
    public void log(User user, String message) {
        System.out.println("File logger,Logged user: " +user.getName());
        System.out.println("The message sent : "+message);
    }
}
