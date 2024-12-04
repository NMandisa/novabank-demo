package za.co.novabank.core.model.account.distinctive;

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
@Table(name = "charity_account")
@DiscriminatorValue("charity_accounts")
public class CharityAccount extends AbstractAccount {
}
