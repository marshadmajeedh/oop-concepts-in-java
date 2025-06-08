package validator;

import exception.InsufficientQuantity;
import exception.QuantityNotNumeric;
import exception.QuantityOutOfRange;

public class Validator {

    public static void validateQuantity(int quantity) throws InsufficientQuantity {
        if (quantity < 1) {
            throw new InsufficientQuantity("Insufficient quantity .Please enter a quantity greater than 0.");
        }
    }

    public static void validateQuantityRange(int quantity) throws QuantityOutOfRange {
        if (quantity < 1 || quantity > 1000) {
            throw new QuantityOutOfRange("Quantity out of range Quantity must be between 1 and 1000.");
        }
    }

    public static void validateInput(String quantity) throws QuantityNotNumeric {

        try {
            Integer.parseInt(quantity);
        } catch (NumberFormatException e) {
            throw new QuantityNotNumeric("Quantity must be a numeric value.");
        }
    } //"^[0-9]*$"
}
