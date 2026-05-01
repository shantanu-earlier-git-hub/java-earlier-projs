package jpa_app.services;

import jpa_app.entities.Role;
import jpa_app.entities.User;
import jpa_app.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void findAll(){

        for(User user : userRepository.findAll()) {
            System.out.println("user = " + user);
            for(Role roles : user.getRoles())
                System.out.println("role = " +roles);

        }
    }


}
