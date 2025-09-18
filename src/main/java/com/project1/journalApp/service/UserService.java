package com.project1.journalApp.service;

import com.project1.journalApp.entity.JournalEntry;
import com.project1.journalApp.entity.User;
import com.project1.journalApp.repository.JournalEntryRepository;
import com.project1.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void saveEntry(User user){
        userRepository.save(user);
    }

    public void saveNewUser(User user){
        userRepository.save(user);
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public String DeleteById(ObjectId id){
        userRepository.deleteById(id);
        return "Data deleted";
    }

    public User findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }
}
