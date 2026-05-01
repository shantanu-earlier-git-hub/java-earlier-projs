package app.auth.security.model;

import app.auth.security.model.entities.Otp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class SecurityOtpUser implements UserDetails {

    private Otp otp;

    public SecurityOtpUser(Otp otp) {
        this.otp = otp;
    }


    public Otp getOtp(){
        return  this.otp;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of( () -> "user");
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return otp.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
