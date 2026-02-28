package org.example.erp_system.service;

import org.example.erp_system.dto.JournalEntryDTO;
import org.example.erp_system.entity.JournalEntry;

import java.util.List;

public interface JournalEntryService {

    List<JournalEntry> getAllEntries();

    int saveEntries(JournalEntryDTO entryDTO);

}
