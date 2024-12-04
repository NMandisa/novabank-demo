package za.co.novabank.core.model.account.specialized;

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
@Table(name = "business_account")
@DiscriminatorValue("business_accounts")
public class BusinessAccount extends AbstractAccount {
}
