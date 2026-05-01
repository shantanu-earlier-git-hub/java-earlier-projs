package app.auth.security.provider;

import app.auth.security.service.TokenService;
import app.auth.security.token.AuthorizationToken;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;


@Component
public class TokenProvider implements AuthenticationProvider {

    private final TokenService tokenService;

    public TokenProvider(TokenService tokenService){
        this.tokenService = tokenService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String tokenStr = authentication.getName();
        LocalDateTime now= LocalDateTime.now();

        var isExist =this.tokenService.isTokenExists(tokenStr);

        if(isExist){
            return new AuthorizationToken(tokenStr, null, List.of(() -> "user"));
        }
        throw new BadCredentialsException("token is not valid");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return AuthorizationToken.class.equals(authentication);
    }
}
