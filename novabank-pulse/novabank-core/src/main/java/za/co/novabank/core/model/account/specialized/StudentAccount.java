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
@Table(name = "student_account")
@DiscriminatorValue("student_accounts")
public class StudentAccount extends AbstractAccount {
}
