package za.co.novabank.core.exception;

/**
 * @author Noxolo.Mkhungo
 */
public class JobExecutionException extends RuntimeException {

    public JobExecutionException() {super();}
    public JobExecutionException(String message) {super(message);}
    public JobExecutionException(String message, Throwable cause) {super(message,cause);}
}