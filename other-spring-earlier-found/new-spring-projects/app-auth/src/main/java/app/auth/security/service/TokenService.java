package app.auth.security.service;


import app.auth.repository.auth.TokenRepository;
import app.auth.security.model.SecurityTokenUser;
import app.auth.security.model.entities.Token;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenService implements UserDetailsManager {

    private final TokenRepository tokenRepository;

    public TokenService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public Token getOrCreateToken(String username, String tokenStr) {

        Token token = null;

        if (this.userExists(username)) {
            var securityTokenUser = (SecurityTokenUser) this.loadUserByUsername(username);
            token = securityTokenUser.getToken();
        }
        else {
            token = new Token();
            token.setUsername(username);
            token.setToken(UUID.randomUUID().toString());
            this.tokenRepository.save(token);
        }

        return token;
    }

    public Boolean isTokenExists(String tokenStr) {
        return this.tokenRepository.existsTokensByToken(tokenStr).get();
    }

    @Override
    public void createUser(UserDetails token) {

    }

    @Override
    public void updateUser(UserDetails token) {

    }

    @Override
    public void deleteUser(String tokenStr) {

    }

    @Override
    public void changePassword(String oldToken, String newToken) {

    }

    @Override
    public boolean userExists(String username) {
        return this.tokenRepository.existsTokenByUsername(username).get();
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return
                this.tokenRepository.findByUsername(username)
                        .map(token -> {
//                            System.out.println("token in Token service findByusername -> " + token.getToken());
                            return new SecurityTokenUser(token);
                        }).orElseThrow(() -> new UsernameNotFoundException("No future token found"));
    }
}
