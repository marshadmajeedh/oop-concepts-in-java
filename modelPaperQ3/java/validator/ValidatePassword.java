package validator;

import exception.InvalidPasswordLengthException;
import exception.InvalidUserNameException;

public class ValidatePassword {

    public static void validatePassword(String password) throws InvalidPasswordLengthException {
        int length = password.length();

        if (length < 8) {
            throw new InvalidPasswordLengthException("The password must be at least 8 characters long");
        }
    }
}
