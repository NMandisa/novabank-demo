package za.co.novabank.core.model.security;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import za.co.novabank.core.enums.security.UserRole;
import za.co.novabank.core.enums.security.UserStatus;
import za.co.novabank.core.enums.security.UserType;
import za.co.novabank.core.model.aml.AMLTransaction;
import za.co.novabank.core.model.kyc.KnowYourCustomer;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Noxolo.Mkhungo
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "user")
public class User {
    @Id
    @SequenceGenerator(name = "user_generator", sequenceName = "sequence_user_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @Column(name = "user_id")
    private Long id;

    @Transient
    @OneToMany(mappedBy="user")
    private Set<KnowYourCustomer> kycs;

    @Transient
    @OneToMany(mappedBy="user")
    private Set<AMLTransaction> amlTransactions;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type", nullable = false)
    private UserType userType;

    /**
     * User's role (ACCOUNT_HOLDER, BENEFICIARY, etc.).
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "user_role", nullable = false)
    private UserRole userRole;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private UserStatus status;

    @NotBlank(message = "Username is mandatory")
    @Size(max = 50, message = "Username should not be more than 50 characters")
    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
