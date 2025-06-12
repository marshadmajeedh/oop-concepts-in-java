package service;

import logger.Logger;
import users.User;

public class LogService {
    private Logger[] loggers;

    public LogService(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void log(User user,String message) {
        for (Logger logger : loggers) {
            logger.log(user, message);
            System.out.println();
        }
    }
}
