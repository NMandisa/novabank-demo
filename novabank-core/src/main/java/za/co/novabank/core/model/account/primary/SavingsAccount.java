package za.co.novabank.core.model.account.primary;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import za.co.novabank.core.model.account.AbstractAccount;


/**
 * @author Noxolo.Mkhungo
 */

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "saving_account")
@DiscriminatorValue("saving_accounts")
public class SavingsAccount extends AbstractAccount {
}
