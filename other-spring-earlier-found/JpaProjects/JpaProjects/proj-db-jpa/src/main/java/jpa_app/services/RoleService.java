package jpa_app.services;

import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private RoleService roleService;

    public RoleService(RoleService roleService) {
        this.roleService = roleService;
    }
}
