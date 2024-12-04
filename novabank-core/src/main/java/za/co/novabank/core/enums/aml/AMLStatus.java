package za.co.novabank.core.enums.aml;

/**
 * @author Noxolo.Mkhungo
 */
public enum AMLStatus {
    PENDING("Pending"),
    IN_PROGRESS("In Progress"),
    VERIFIED("Verified"),
    REJECTED("Rejected"),
    EXPIRED("Expired"),
    INVALID("Invalid"),
    UNDER_REVIEW("Under Review"),
    CONFIRMED("Confirmed"),
    FAILED("Failed"),
    NOT_APPLICABLE("Not Applicable"),
    FLAGGED("Flagged"),
    CLEARED("Cleared");

    private final String description;

    AMLStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
