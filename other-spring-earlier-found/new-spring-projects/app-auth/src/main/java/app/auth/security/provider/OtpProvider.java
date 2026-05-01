package app.auth.security.provider;

import app.auth.security.service.OtpService;
import app.auth.security.token.OtpAuthToken;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OtpProvider implements AuthenticationProvider {

    private final OtpService otpService;

    public OtpProvider(OtpService otpService){
        this.otpService = otpService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String otp = authentication.getCredentials().toString();
        LocalDateTime now = LocalDateTime.now();

        var otpUser = this.otpService.loadOtpByUsername(username, otp);
        System.out.println("roles size" + otpUser.getAuthorities().size());

        if(null!= otpUser){
            return new OtpAuthToken(username, otp, otpUser.getAuthorities());
        }
        throw new BadCredentialsException("no otp found");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return OtpAuthToken.class.equals(authentication);
    }
}
