package za.co.novabank.core.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.novabank.core.enums.account.AccountStatus;
import za.co.novabank.core.enums.account.AccountType;
import za.co.novabank.core.model.account.primary.CurrentAccount;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface CurrentAccountRepository extends JpaRepository<CurrentAccount,Long> {
    // query methods specific to CurrentAccount
    List<CurrentAccount> findByStatus(AccountStatus status);
    List<CurrentAccount> findByType(AccountType type);
}
