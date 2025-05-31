package validator;

import exception.InvalidUserNameException;

public class ValidateUserName {

    public static void validateUserName(String userName) throws InvalidUserNameException{

        int length = userName.length();

        if(length < 6) {
            throw new InvalidUserNameException("Atleast username should contain 6 characters");
        }
    }
}
