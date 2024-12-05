package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class AMLViolationException extends RuntimeException {

    public AMLViolationException() {super();}
    public AMLViolationException(String message) {super(message);}
    public AMLViolationException(String message, Throwable cause) {super(message,cause);}
}