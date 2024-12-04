package za.co.novabank.core.model;

import jakarta.persistence.*;
import za.co.novabank.core.enums.UserRole;
import za.co.novabank.core.enums.UserStatus;
import za.co.novabank.core.enums.UserType;
import za.co.novabank.core.model.aml.AMLTransaction;
import za.co.novabank.core.model.kyc.KnowYourCustomer;

import java.util.Set;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
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

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;
}
