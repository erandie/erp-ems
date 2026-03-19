package org.example.erp_system.controller;

import org.example.erp_system.dto.JournalEntryDTO;
import org.example.erp_system.entity.JournalEntry;
import org.example.erp_system.service.implementation.JournalEntryServiceImpl;
import org.example.erp_system.util.ResponseUtil;
import org.example.erp_system.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/journal")
@CrossOrigin
@Validated
public class JournalEntryController {

    @Autowired
    private JournalEntryServiceImpl journalEntryService;

    @GetMapping("/get")
    public List<JournalEntry> getAllEntries(){
        return journalEntryService.getAllEntries();
    }

    @PostMapping("/save")
    public ResponseEntity<ResponseUtil> saveJournal(@RequestBody JournalEntryDTO journalEntryDTO){

        int res = journalEntryService.saveEntries(journalEntryDTO);

        if (res == VarList.Created) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseUtil(201, "Journal Entry Saved Successfully!", null));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .body(new ResponseUtil(406, "Cant save the entry!", null));
        }

    }

}
