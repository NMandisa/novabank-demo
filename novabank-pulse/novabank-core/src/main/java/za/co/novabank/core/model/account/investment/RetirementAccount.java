package za.co.novabank.core.model.account.investment;

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
@Table(name = "retirement_account")
@DiscriminatorValue("retirement_accounts")
public class RetirementAccount extends AbstractAccount {
}
