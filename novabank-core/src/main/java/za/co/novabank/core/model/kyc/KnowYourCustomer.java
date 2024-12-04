package za.co.novabank.core.model.kyc;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import za.co.novabank.core.enums.kyc.DocumentStatus;
import za.co.novabank.core.enums.kyc.DocumentType;
import za.co.novabank.core.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Noxolo.Mkhungo
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "know_your_customer")
public class KnowYourCustomer {
    @Id
    @SequenceGenerator(name = "kyc_generator", sequenceName = "sequence_kyc_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kyc_generator")
    @Column(name = "kyc_id")
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "know_your_customer_has_users",
            joinColumns = @JoinColumn(name = "kyc_id", referencedColumnName = "kyc_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "user_id_fk")
            ))
    private User user;
    @Column(name = "document_type")
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    @Column(name = "document_status")
    @Enumerated(EnumType.STRING)
    private DocumentStatus documentStatus;
    @Column(name = "risk_score", precision = 5, scale = 2)
    private BigDecimal riskScore;

    @Column(name = "provider", length = 50)
    private String provider;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Transient
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @Transient
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}