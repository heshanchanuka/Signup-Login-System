package com.assessment.login.service;


import com.assessment.login.entity.Role;
import com.assessment.login.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public Role createNewRole(Role role) {

        return roleRepo.save(role);

    }

}
