package za.co.novabank.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.novabank.core.enums.account.AccountStatus;
import za.co.novabank.core.enums.account.AccountType;
import za.co.novabank.core.model.account.primary.SavingsAccount;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccount,Long> {
    // query methods specific to SavingsAccount
    List<SavingsAccount> findByStatus(AccountStatus status);
    List<SavingsAccount> findByType(AccountType type);
}
