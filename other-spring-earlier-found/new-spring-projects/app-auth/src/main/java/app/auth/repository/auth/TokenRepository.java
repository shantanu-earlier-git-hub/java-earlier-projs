package app.auth.repository.auth;

import app.auth.security.model.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Integer> {

     Optional<Token> findByUsername(String username);
     Optional<Boolean> existsTokenByUsername(String username);
     Optional<Boolean> existsTokensByToken(String tokenStr);
}
