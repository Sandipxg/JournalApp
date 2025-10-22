package com.project1.journalApp.repository;

import com.project1.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
}

// MongoRepository is a Spring Data interface
// that gives you a full set of database operations without writing any code.


/*
You get access to all this methods once u extend it with MongoRepository
    save(task);                    // Insert or update
    findById(ObjectId id);         // Find by ID
    findAll();                     // Get all documents
    deleteById(ObjectId id);       // Delete by ID
    count();                       // Count all documents
    existsById(ObjectId id);       // Check if exists
*/
