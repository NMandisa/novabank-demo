package za.co.novabank.core.model.account.primary;

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
@Table(name = "saving_account")
@DiscriminatorValue("saving_accounts")
public class SavingsAccount extends AbstractAccount {

}
