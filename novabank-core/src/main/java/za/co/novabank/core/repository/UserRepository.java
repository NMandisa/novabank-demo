package za.co.novabank.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.novabank.core.model.User;

/**
 * @author Noxolo.Mkhungo
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
