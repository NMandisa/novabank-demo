package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class KYCVerificationException extends RuntimeException {

    public KYCVerificationException() {super();}
    public KYCVerificationException(String message) {super(message);}
    public KYCVerificationException(String message, Throwable cause) {super(message,cause);}
}