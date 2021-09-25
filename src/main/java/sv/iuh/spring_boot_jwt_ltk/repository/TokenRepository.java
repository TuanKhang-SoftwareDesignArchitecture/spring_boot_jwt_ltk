package sv.iuh.spring_boot_jwt_ltk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.iuh.spring_boot_jwt_ltk.entity.Token;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
