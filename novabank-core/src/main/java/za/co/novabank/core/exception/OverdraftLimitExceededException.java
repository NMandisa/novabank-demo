package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class OverdraftLimitExceededException extends RuntimeException {

    public OverdraftLimitExceededException() {super();}
    public OverdraftLimitExceededException(String message) {super(message);}
    public OverdraftLimitExceededException(String message, Throwable cause) {super(message,cause);}
}