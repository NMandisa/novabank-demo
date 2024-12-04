package za.co.novabank.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.novabank.core.model.Customer;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}