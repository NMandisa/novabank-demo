package za.co.novabank.core.model.account.digital;

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
@Table(name = "online_trading_account")
@DiscriminatorValue("online_trading_accounts")
public class OnlineTradingAccount extends AbstractAccount {
}
