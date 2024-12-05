package za.co.novabank.core.enums.kyc;

/**
 * @author Noxolo.Mkhungo
 */
public enum DocumentType {
    RSA_ID_BOOK("RSA ID Book"),
    RSA_ID_CARD("RSA ID Card"),
    RSA_PASSPORT("RSA Passport"),
    DRIVER_LICENSE("Driver's License"),
    BIRTH_CERTIFICATE("Birth Certificate"),
    MARRIAGE_CERTIFICATE("Marriage Certificate"),
    DIVORCE_DECREE("Divorce Decree"),
    UTILITY_BILL("Utility Bill"),
    LEASE_AGREEMENT("Lease Agreement"),
    SARS_DOCUMENT("SARS Document"),
    OTHER("Other");

    private final String description;

    DocumentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
