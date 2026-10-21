package com.assessment.login.controller;

import com.assessment.login.entity.Role;
import com.assessment.login.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @PostMapping("/create-new-role")
    public Role createRole(@RequestBody Role role) {

        return roleService.createNewRole(role);
    }


}
