package za.co.novabank.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.novabank.core.model.account.Transaction;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
