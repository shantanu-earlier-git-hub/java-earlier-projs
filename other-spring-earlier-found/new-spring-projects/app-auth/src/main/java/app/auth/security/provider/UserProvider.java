package app.auth.security.provider;

import app.auth.security.model.SecurityUser;
import app.auth.security.service.UserService;
import app.auth.security.token.UserAuthToken;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserProvider implements AuthenticationProvider {

      private final UserService userService;
      private final PasswordEncoder passwordEncoder;

    public UserProvider(UserService userService,
                        PasswordEncoder passwordEncoder){
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        SecurityUser securityUser =  (SecurityUser)this.userService.loadUserByUsername(username);

        if(passwordEncoder.matches(password, securityUser.getPassword())){
            UserAuthToken userAuth = new UserAuthToken(username, password,securityUser.getAuthorities());
            userAuth.setDetails(securityUser);
            return userAuth;
        }
            throw new BadCredentialsException("user not valid");

    }

    @Override
    public boolean supports(Class<?> appTokenClass) {
        return UserAuthToken.class.equals(appTokenClass);

    }
}
