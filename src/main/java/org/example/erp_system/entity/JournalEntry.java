package org.example.erp_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
}
