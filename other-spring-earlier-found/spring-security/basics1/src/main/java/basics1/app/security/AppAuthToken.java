package basics1.app.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;


public class AppAuthToken extends UsernamePasswordAuthenticationToken {

    public AppAuthToken(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public AppAuthToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}
