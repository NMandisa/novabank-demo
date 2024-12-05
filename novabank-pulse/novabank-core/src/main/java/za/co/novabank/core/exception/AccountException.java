package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class AccountException extends RuntimeException {

    public AccountException() {super();}
    public AccountException(String message) {super(message);}
    public AccountException(String message, Throwable cause) {super(message,cause);}
}