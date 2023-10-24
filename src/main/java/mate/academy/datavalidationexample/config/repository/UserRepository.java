package mate.academy.datavalidationexample.config.repository;

import mate.academy.datavalidationexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
