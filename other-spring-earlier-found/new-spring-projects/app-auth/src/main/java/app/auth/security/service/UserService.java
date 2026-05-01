package app.auth.security.service;


import app.auth.repository.auth.RolesRepository;
import app.auth.repository.auth.UserRepository;
import app.auth.security.model.SecurityUser;
import app.auth.security.model.entities.User;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserDetailsManager {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository,
                       RolesRepository rolesRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Integer userId){
        return this.userRepository.findById(userId).get();
    }


    @Override
    public void createUser(UserDetails userDetails) {
        User userEntity = ((SecurityUser)userDetails).getUser();
        this.userRepository.save(userEntity);
    }

    @Override
    public void updateUser(UserDetails userDetails) {
        User userEntity = ((SecurityUser)userDetails).getUser();
        this.userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(String username) {
        SecurityUser securityUser= (SecurityUser) loadUserByUsername(username);
        User loadedUser= securityUser.getUser();

        if(null!=loadedUser) {
            this.userRepository.delete(loadedUser);
        }

    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        User userEntity = new User();
        if(oldPassword!= newPassword)
            userEntity.setPassword(newPassword);
        this.userRepository.save(userEntity);
    }

    @Override
    public boolean userExists(String username) {

        SecurityUser securityUser= (SecurityUser) loadUserByUsername(username);
        User loadedUser= securityUser.getUser();

        if(null!=loadedUser) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return
                this.userRepository.findUserByUsername(username)
                        .map(user -> new SecurityUser(user))
                        .orElseThrow(() -> new BadCredentialsException("user not found"));
        }


}
