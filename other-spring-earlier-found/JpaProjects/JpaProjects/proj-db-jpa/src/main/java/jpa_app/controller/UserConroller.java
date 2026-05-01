package jpa_app.controller;

import jpa_app.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConroller {

    private final UserService userService;

    public UserConroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public void findAll(){
        userService.findAll();
    }


}
