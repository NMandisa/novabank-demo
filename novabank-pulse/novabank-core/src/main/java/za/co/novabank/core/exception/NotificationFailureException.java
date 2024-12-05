package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class NotificationFailureException extends RuntimeException {

    public NotificationFailureException() {super();}
    public NotificationFailureException(String message) {super(message);}
    public NotificationFailureException(String message, Throwable cause) {super(message,cause);}
}