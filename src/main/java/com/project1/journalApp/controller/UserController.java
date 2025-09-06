package com.project1.journalApp.controller;


import com.project1.journalApp.entity.User;
import com.project1.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> getAllUser(){
        return userService.getAll();
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.saveEntry(user);
    }

    @PutMapping("/{userName}")
    public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable String userName){
        User userInDb = userService.findByUserName(userName);
        if(userInDb!=null){
            userInDb.setUsername(user.getUsername());
            userInDb.setPassword(user.getPassword());
            userService.saveEntry(userInDb);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    /*
    # Explaination of UpdateUser() method

    1] Request Object (user)
        --> Created only for the duration of the method call.
        --> Populated from JSON.
        --> Temporary — not stored in DB.

    2] Database Object (userInDb)
        --> Fetched from DB.
        --> Updated with values from user.
        --> Saved back to DB.
    */
}




