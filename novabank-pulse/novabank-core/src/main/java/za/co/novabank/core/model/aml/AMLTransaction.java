package za.co.novabank.core.model.aml;

import jakarta.persistence.*;
import lombok.Data;
import za.co.novabank.core.enums.aml.AMLStatus;
import za.co.novabank.core.enums.aml.AMLTransactionType;
import za.co.novabank.core.model.security.User;

import java.time.LocalDateTime;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Entity
@Table(name = "aml_transaction")
public class AMLTransaction {
    @Id
    @SequenceGenerator(name = "aml_transaction_generator", sequenceName = "sequence_aml_transaction_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aml_transaction_generator")
    @Column(name = "aml_transaction_id")
    private Long id;

    /**
     * Unique transaction ID.
     */
    @Column(name = "transaction_id", nullable = false, unique = true)
    private String transactionId;

    /**
     * Account ID associated with the transaction.
     */
    @Column(name = "account_id", nullable = false)
    private String accountId;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "transaction_type", nullable = false)
    private AMLTransactionType transactionType;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private AMLStatus status;

    /**
     * Reason for flagging the transaction (if applicable).
     */
    @Column(name = "flagged_reason")
    private String flaggedReason;

    /**
     * Date and time of the transaction.
     */
    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "aml_transaction_has_reviewers",
            joinColumns = @JoinColumn(name = "aml_transaction_id", referencedColumnName = "aml_transaction_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id",foreignKey=@ForeignKey(name = "user_id_fk")
            ))
    private User reviewedBy;

    /**
     * Date and time of review (if applicable).
     */
    @Column(name = "reviewed_date")
    private LocalDateTime reviewedDate;
}
