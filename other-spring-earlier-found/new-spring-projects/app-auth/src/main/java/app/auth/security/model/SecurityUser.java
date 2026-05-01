package app.auth.security.model;

import app.auth.security.model.entities.Roles;
import app.auth.security.model.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SecurityUser implements UserDetails {

    private User user = new User();

    public SecurityUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Roles role = new Roles();
        SimpleGrantedAuthority simpleAuths = null;
        List<SimpleGrantedAuthority> allAuths = new ArrayList<>();

        List<Roles> roles = this.user.getRoles();

        for (Iterator index = roles.iterator(); index.hasNext(); ) {
            role = (Roles) index.next();
            System.out.println("role name" + role.getRoleName());
            simpleAuths = new SimpleGrantedAuthority(role.getRoleName());
            allAuths.add(simpleAuths);
        }
        return allAuths;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return user.getLocked() == 1 ? false : true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getDisabled() == 1 ? false : true;
    }
}
