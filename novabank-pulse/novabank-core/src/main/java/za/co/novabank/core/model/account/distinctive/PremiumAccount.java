package za.co.novabank.core.model.account.distinctive;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import za.co.novabank.core.model.account.AbstractAccount;

/**
 * @author Noxolo.Mkhungo
 */
@Builder
@AllArgsConstructor
@Data
@Entity
@Table(name = "premium_account")
@DiscriminatorValue("premium_accounts")
public class PremiumAccount extends AbstractAccount {
}
