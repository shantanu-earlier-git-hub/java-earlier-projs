package app.auth.security.config;

import app.auth.security.filter.TokenFilter;
import app.auth.security.filter.UserPasswordAuthFilter;
import app.auth.security.provider.OtpProvider;
import app.auth.security.provider.TokenProvider;
import app.auth.security.provider.UserProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserPasswordAuthFilter userPasswordAuthFilter;
    private final TokenFilter tokenFilter;

    private final UserProvider userProvider;
    private final OtpProvider otpProvider;
    private final TokenProvider tokenProvider;


    public SecurityConfig(@Lazy UserPasswordAuthFilter userPasswordAuthFilter,
                          @Lazy UserProvider userProvider,
                          @Lazy OtpProvider otpProvider,
                          @Lazy TokenProvider tokenProvider,
                          @Lazy TokenFilter tokenFilter) {

        this.userProvider = userProvider;
        this.userPasswordAuthFilter = userPasswordAuthFilter;
        this.otpProvider = otpProvider;
        this.tokenProvider = tokenProvider;
        this.tokenFilter = tokenFilter;
    }


    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .authenticationProvider(this.userProvider)
                .authenticationProvider(this.otpProvider)
                .authenticationProvider(this.tokenProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues());
        http.httpBasic();
        http.csrf().disable();
        http
                .authorizeRequests()
                .mvcMatchers("/new")
                .permitAll()
                .anyRequest().authenticated();

        http.addFilterAt(this.userPasswordAuthFilter, BasicAuthenticationFilter.class)
                .addFilterAfter(this.tokenFilter, BasicAuthenticationFilter.class);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
