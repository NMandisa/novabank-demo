package za.co.novabank.core.enums;

/**
 * @author Noxolo.Mkhungo
 */
public enum IdentificationType {
    PASSPORT("Passport"),
    NATIONAL_ID("National ID"),
    DRIVER_LICENSE("Driver's License"),
    BIRTH_CERTIFICATE("Birth Certificate"),
    RESIDENCE_PERMIT("Residence Permit");
    private final String description;
    IdentificationType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}