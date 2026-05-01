package basics1.app.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


public class AuthFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    private final PasswordEncoder passwordEncoder;
    private final Environment environment;

    public AuthFilter(AuthenticationManager authenticationManager, PasswordEncoder passwordEncoder, Environment environment) {
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = passwordEncoder;
        this.environment = environment;
    }


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        var username = request.getParameter("user");
        var password = request.getParameter("password");

        System.out.println("user= " + username);
        System.out.println("password = " + password);

        var auth = super.attemptAuthentication(request, response);
        System.out.println("auth = " + auth);
        return auth;
    }
}
