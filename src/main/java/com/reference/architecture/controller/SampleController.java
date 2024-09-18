package com.reference.architecture.controller;

import com.reference.architecture.entity.domain.User;
import com.reference.architecture.repository.IUserRepository;
import com.reference.architecture.service.IUserService;
import com.reference.architecture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SampleController {


    @Autowired
    private IUserService userService;

    @GetMapping("/example")
    public String getExample() {
        return "";
    }

    @GetMapping("/provider")
    public String getCurrentDatabase() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {

        return ResponseEntity.of(
                Optional.ofNullable(
                        userService.getUsers()));
    }

}
