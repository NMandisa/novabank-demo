package za.co.novabank.core.model.kyc;

import jakarta.persistence.*;
import lombok.*;
import za.co.novabank.core.model.security.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Noxolo.Mkhungo
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
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

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Document> document;

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