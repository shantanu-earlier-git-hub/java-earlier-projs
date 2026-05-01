package app.auth.repository.auth;

import app.auth.security.model.entities.Otp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OtpRepository extends JpaRepository<Otp, Integer> {

    public Optional<Otp> findByUsername(String username);

    public Optional<Otp> findOtpByUsernameAndOtp(String username, String otp);
}
