package com.reference.architecture.controller;

import com.reference.architecture.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SampleController {

    //private IUserRepository userRepository;

    /**@Autowired
    public SampleController(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }*/

    @GetMapping("/example")
    public String getExample() {
        return "Hello World!";
    }

}
