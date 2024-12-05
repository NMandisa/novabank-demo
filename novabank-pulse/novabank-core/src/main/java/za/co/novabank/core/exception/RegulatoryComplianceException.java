package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class RegulatoryComplianceException extends RuntimeException {

    public RegulatoryComplianceException() {super();}
    public RegulatoryComplianceException(String message) {super(message);}
    public RegulatoryComplianceException(String message, Throwable cause) {super(message,cause);}
}