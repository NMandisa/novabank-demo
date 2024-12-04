package za.co.novabank.core.model.account.deposit;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import za.co.novabank.core.model.account.AbstractAccount;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "recurring_deposit_account")
@DiscriminatorValue("recurring_deposit_accounts")
public class RecurringDepositAccount extends AbstractAccount {
}
