package com.reference.architecture.service;

import com.reference.architecture.entity.domain.User;
import com.reference.architecture.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements IUserService {



    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
}
