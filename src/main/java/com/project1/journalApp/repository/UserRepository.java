package com.project1.journalApp.repository;

import com.project1.journalApp.entity.JournalEntry;
import com.project1.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUsername(String username);

    void deleteByUsername(String username);
    // Spring_is_smart
    // Spring Data reads your method name, builds a query automatically,
    // executes it, maps the result to User, and returns it...
}
