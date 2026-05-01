package app.auth.security.model;

import app.auth.security.model.entities.Token;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


public class SecurityTokenUser implements UserDetails {

    private Token token;

    public SecurityTokenUser(Token token){
        this.token =token;
    }

    public Token getToken(){
        return this.token;
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
        return token.getUsername();
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
