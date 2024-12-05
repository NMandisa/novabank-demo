package za.co.novabank.core.enums.kyc;

/**
 * @author Noxolo.Mkhungo
 */
public enum DocumentStatus {
    PENDING("Pending"),
    IN_PROGRESS("In Progress"),
    VERIFIED("Verified"),
    REJECTED("Rejected"),
    EXPIRED("Expired"),
    INVALID("Invalid"),
    UNDER_REVIEW("Under Review"),
    CONFIRMED("Confirmed"),
    FAILED("Failed"),
    NOT_APPLICABLE("Not Applicable");

    private final String description;

    DocumentStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
