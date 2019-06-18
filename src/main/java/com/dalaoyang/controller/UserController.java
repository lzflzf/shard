package com.dalaoyang.controller;

import com.dalaoyang.entity.User;
import com.dalaoyang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("save")
    public void save(){
        Optional<User> optionalUser = userRepository.findById(111L);

        User user = null ;

        if(optionalUser.isPresent()){
            user = optionalUser.get();
        }else {
            user = new User() ;
        }

        user.setName("dalaoyang");
        user.setCity("beijing");
        userRepository.save(user);
    }

    @GetMapping("getAll")
    public Object getAll(){
        return userRepository.findAll();
    }
}