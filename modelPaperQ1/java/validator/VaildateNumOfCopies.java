package validator;

import exception.AvailableCopiesAreInSuffecientException;

public class VaildateNumOfCopies {

    public static void validateNumOfCopies(int numOfCopies,int availableCopies) {

        if (numOfCopies > availableCopies) {
            throw new AvailableCopiesAreInSuffecientException("Not enough copies available");
        }
    }
}
