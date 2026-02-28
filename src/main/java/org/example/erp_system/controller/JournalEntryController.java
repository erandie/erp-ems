package org.example.erp_system.controller;

import org.example.erp_system.entity.JournalEntry;
import org.example.erp_system.service.implementation.JournalEntryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/entry")
@CrossOrigin
@Validated
public class JournalEntryController {

    @Autowired
    private JournalEntryServiceImpl journalEntryService;

    @GetMapping("/get")
    public List<JournalEntry> getAllEntries(){
        return journalEntryService.getAllEntries();
    }

}
