package app.auth.security.filter;

import app.auth.security.service.TokenService;
import app.auth.security.service.UserService;
import app.auth.security.token.UserAuthToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class UserPasswordAuthFilter extends OncePerRequestFilter {

    private final AuthenticationManager authenticationManager;

    private final UserService userService;
    private final TokenService tokenService;


    public UserPasswordAuthFilter(AuthenticationManager authenticationManager,
                                  UserService userService,
                                  TokenService tokenService
    ) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.tokenService = tokenService;
    }


    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return
                request.getServletPath().equals("/new") ||
                        request.getServletPath().equals("/logout");
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        Authentication auth = null;
        String username, password = null;
        username = request.getHeader("username");
        password = request.getHeader("password");


//        System.out.println("username" + username);
//        System.out.println("password" + password);

        if (username != null && password != null) {
            auth = new UserAuthToken(username, password);
            auth = this.authenticationManager.authenticate(auth);


            SecurityContext context = SecurityContextHolder.getContext();
            context.setAuthentication(auth);

        }
        filterChain.doFilter(request, response);

    }
}
