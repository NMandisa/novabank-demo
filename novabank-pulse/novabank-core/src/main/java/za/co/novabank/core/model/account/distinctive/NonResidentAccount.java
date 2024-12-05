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
@Table(name = "non_resident_account")
@DiscriminatorValue("non_resident_accounts")
public class NonResidentAccount extends AbstractAccount {
}
