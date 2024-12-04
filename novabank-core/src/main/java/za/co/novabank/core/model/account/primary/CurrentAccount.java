package za.co.novabank.core.model.account.primary;

import jakarta.persistence.*;
import lombok.*;
import za.co.novabank.core.model.account.AbstractAccount;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "current_account")
@DiscriminatorValue("current_accounts")
public class CurrentAccount extends AbstractAccount {
}
