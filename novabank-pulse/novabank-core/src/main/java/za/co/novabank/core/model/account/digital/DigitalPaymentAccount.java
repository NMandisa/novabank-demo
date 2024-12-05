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
@Table(name = "digital_payment_account")
@DiscriminatorValue("digital_payment_accounts")
public class DigitalPaymentAccount extends AbstractAccount {
}
