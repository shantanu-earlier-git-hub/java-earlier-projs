package app.auth.security.filter;

import app.auth.security.token.AuthorizationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@CrossOrigin
public class TokenFilter extends OncePerRequestFilter {

    private final AuthenticationManager authenticationManager;

    public TokenFilter(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return
                request.getServletPath().equals("/new") ||
                        request.getServletPath().equals("/logout");
    }
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String token = request.getHeader("Authorization");
        System.out.println("token is ... " + token);

        if(null!= token) {
            Authentication authentication = new AuthorizationToken(token, null);
            var auth = this.authenticationManager.authenticate(authentication);

            SecurityContext context= SecurityContextHolder.getContext();
            context.setAuthentication(auth);

            System.out.println(context.getAuthentication().getName());
            filterChain.doFilter(request, response);
        }
        else{
            System.out.println("token is null");
        }
        filterChain.doFilter(request, response);
    }
}
