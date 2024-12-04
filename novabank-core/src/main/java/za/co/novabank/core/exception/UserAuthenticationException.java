package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class UserAuthenticationException extends RuntimeException {

    public UserAuthenticationException() {super();}
    public UserAuthenticationException(String message) {super(message);}
    public UserAuthenticationException(String message, Throwable cause) {super(message,cause);}
}