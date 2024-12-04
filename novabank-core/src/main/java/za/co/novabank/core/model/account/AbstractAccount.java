package za.co.novabank.core.model.account;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import za.co.novabank.core.enums.account.AccountCategory;
import za.co.novabank.core.enums.account.AccountStatus;
import za.co.novabank.core.enums.account.AccountType;

import java.io.Serializable;

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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountCategory category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountStatus status;
}
