package sv.iuh.spring_boot_jwt_ltk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.iuh.spring_boot_jwt_ltk.entity.User;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
