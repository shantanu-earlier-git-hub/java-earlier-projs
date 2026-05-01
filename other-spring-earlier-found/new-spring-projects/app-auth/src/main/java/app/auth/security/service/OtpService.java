package app.auth.security.service;

import app.auth.repository.auth.OtpRepository;
import app.auth.security.model.SecurityOtpUser;
import app.auth.security.model.entities.Otp;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class OtpService  {

    private final OtpRepository otpRepository;

    public OtpService(OtpRepository otpRepository){
        this.otpRepository = otpRepository;
    }

    public void saveOtp(Otp otpObject){
        this.otpRepository.save(otpObject);
    }

    public UserDetails loadOtpByUsername(String username, String otp) throws UsernameNotFoundException {
        return
                this.otpRepository.findOtpByUsernameAndOtp(username, otp)
                        .map(userOtp -> new SecurityOtpUser(userOtp))
                        .orElseThrow(() -> new BadCredentialsException("user not found"));
    }


}

