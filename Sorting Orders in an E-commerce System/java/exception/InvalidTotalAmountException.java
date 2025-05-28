package exception;

public class InvalidTotalAmountException extends RuntimeException {
    public InvalidTotalAmountException(String message) {
        super(message);
    }
}
