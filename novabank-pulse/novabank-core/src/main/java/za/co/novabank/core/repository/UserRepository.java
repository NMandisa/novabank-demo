package za.co.novabank.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.novabank.core.model.security.User;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
