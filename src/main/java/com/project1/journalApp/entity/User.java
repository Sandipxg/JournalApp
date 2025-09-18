package com.project1.journalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
@NoArgsConstructor
public class User {

    @Id // u did @Id hence id will be genrated automatically .
    private ObjectId id;
    @Indexed(unique = true)  // resource > application.properties > u need to add one must line there else nai hoga
    @NonNull
    private String username;
    @NonNull
    private String password;

    @DBRef // with @DBRef, MongoDB only stores the @Id (reference) of related documents, never the whole object
    private List<JournalEntry> journalEntries = new ArrayList<>();

    private List<String> roles;
}


// If you annotate your fields with @NotNull, @NotBlank, etc. and use @Valid on the method parameter,
// then all required fields must be provided, otherwise you’ll get a validation error.