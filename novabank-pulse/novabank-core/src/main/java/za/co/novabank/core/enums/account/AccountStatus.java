package za.co.novabank.core.enums.account;

/**
 * @author Noxolo.Mkhungo
 */
public enum AccountStatus {
    ACTIVE, // The account is open and operational.
    INACTIVE,// The account hasn't been used for a certain period.
    FROZEN, // The account is temporarily disabled, often due to suspicious activity.
    PENDING, // The account is in the process of being opened or closed.
    CLOSED, // The account has been permanently closed.
    SUSPENDED, // The account is temporarily suspended, often for regulatory reasons.
    DORMANT, // The account has been inactive for a long time and may require reactivation.
    OVERDRAWN, // The account has a negative balance.
    RESTRICTED, // The account has limitations on certain types of transactions.
    LOCKED // The account is locked, usually due to security concerns.
}
