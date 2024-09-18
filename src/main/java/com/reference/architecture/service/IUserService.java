package com.reference.architecture.service;

import com.reference.architecture.entity.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    List<User> getUsers();

}
