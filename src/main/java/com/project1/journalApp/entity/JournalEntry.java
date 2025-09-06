package com.project1.journalApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document

@Data
@NoArgsConstructor

public class JournalEntry {

    @Id // we say id is a uniq identefier in our db, in sql we say its primary key
    private ObjectId id;
    private String title; // @Column(unique = true)  // ensures title is unique
    private String content;
    private LocalDateTime date;




}
