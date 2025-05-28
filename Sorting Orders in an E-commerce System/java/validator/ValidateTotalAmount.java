package validator;

import exception.InvalidTotalAmountException;

public class ValidateTotalAmount {

    public static void validateTotalAmount(double totalAmount) {
        if (totalAmount < 0) {

            throw new InvalidTotalAmountException("Total amount must be a positive number");
        }
    }
}
