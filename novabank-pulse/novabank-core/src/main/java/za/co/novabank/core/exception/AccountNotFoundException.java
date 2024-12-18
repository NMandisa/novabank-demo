package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException() {super();}
    public AccountNotFoundException(String message) {super(message);}
    public AccountNotFoundException(String message, Throwable cause) {super(message,cause);}
}