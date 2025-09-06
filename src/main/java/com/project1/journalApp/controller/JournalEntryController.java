/*
package com.project1.journalApp.controller;

import com.project1.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);

        return true;
    }

    @GetMapping("id/{Myid}")
    public JournalEntry getJournalEntryByID(@PathVariable Long Myid){
        return journalEntries.get(Myid);
    }

    @DeleteMapping("id/{Myid}")
    public String DeleteJournalEntryByID(@PathVariable Long Myid){
        journalEntries.remove(Myid);
        return "Entry is deleted with id"+Myid;
    }

    @PutMapping("id/{Myid}")
    public String EditDataById(Long Myid,@RequestBody JournalEntry myEntry){
        journalEntries.put(Myid,myEntry);
        return "Entry is edited with entry id :"+Myid;
    }
}
*/
