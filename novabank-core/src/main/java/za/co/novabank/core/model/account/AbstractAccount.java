package za.co.novabank.core.model.account;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import za.co.novabank.core.enums.account.AccountCategory;
import za.co.novabank.core.enums.account.AccountStatus;
import za.co.novabank.core.enums.account.AccountType;
import za.co.novabank.core.model.Customer;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Noxolo.Mkhungo
 */
@EqualsAndHashCode
@Getter
@Setter
@MappedSuperclass
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,name = "account_type")
public abstract class AbstractAccount implements Serializable {
    @Id
    @SequenceGenerator(name = "account_generator", sequenceName = "sequence_account_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_generator")
    @Column(name = "account_id")
    private Long id;
    @Transient
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountCategory category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountStatus status;

    @Column(name = "account_number", nullable = false, unique = true)
    private String accountNumber;//Next and account number generation strategy / embeddableID

    @Column(name = "balance", nullable = false)
    private Double balance;
    @Transient
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Transaction> transactions;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();
}
