package org.example.erp_system.service.implementation;

import jakarta.transaction.Transactional;
import org.example.erp_system.dto.JournalEntryDTO;
import org.example.erp_system.entity.JournalEntry;
import org.example.erp_system.repository.JournalEntryRepository;
import org.example.erp_system.service.JournalEntryService;
import org.example.erp_system.util.VarList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class JournalEntryServiceImpl implements JournalEntryService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    @Override
    public List<JournalEntry> getAllEntries() {
        List<JournalEntry> entries = journalEntryRepository.findAll();
        return modelMapper.map(entries, new TypeToken<List<JournalEntryDTO>>(){}.getType());
    }

    @Override
    public int saveEntries(JournalEntryDTO entryDTO) {
        if (journalEntryRepository.existsById(entryDTO.getJournalId())) {
            return VarList.Not_Acceptable;
        }

        JournalEntry entry = modelMapper.map(entryDTO, JournalEntry.class);

        journalEntryRepository.save(entry);

        return VarList.Created;

    }
}

























