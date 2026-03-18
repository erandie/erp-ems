package org.example.erp_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JournalEntry {

    @Id
    private Integer journalId;
    private String journalNumber;
    private LocalDate date;
    private String description;

    @Enumerated(EnumType.STRING)
    private EntryStatus status;

    @OneToMany(mappedBy = "journalEntry", cascade = CascadeType.ALL)
    private List<JournalEntryLine> lines = new ArrayList<>();

}
