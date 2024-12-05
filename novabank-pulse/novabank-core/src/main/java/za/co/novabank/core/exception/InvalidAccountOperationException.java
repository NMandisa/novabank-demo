package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class InvalidAccountOperationException extends RuntimeException {

    public InvalidAccountOperationException() {super();}
    public InvalidAccountOperationException(String message) {super(message);}
    public InvalidAccountOperationException(String message, Throwable cause) {super(message,cause);}
}