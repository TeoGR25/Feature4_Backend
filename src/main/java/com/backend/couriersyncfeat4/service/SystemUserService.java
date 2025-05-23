package com.backend.couriersyncfeat4.service;

import com.backend.couriersyncfeat4.entity.SystemUser;
import com.backend.couriersyncfeat4.interfaces.ISystemUserService;
import com.backend.couriersyncfeat4.repository.SystemUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SystemUserService implements ISystemUserService {

    @Autowired
    SystemUserRepository systemUserRepository;

    // TODO: make validations in each function
    public List<SystemUser> findAllUsers() {
        return systemUserRepository.findAll();
    }

    public SystemUser findUserById(int id) {
        return systemUserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public SystemUser saveUser(SystemUser user) {
        return systemUserRepository.save(user);
    }

    public SystemUser findUserByEmail(String email){
        return systemUserRepository.findByEmail(email);
    }
}
