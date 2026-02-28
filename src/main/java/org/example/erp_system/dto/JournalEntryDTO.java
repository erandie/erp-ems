package org.example.erp_system.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.erp_system.entity.EntryStatus;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JournalEntryDTO {

    private Integer journalId;
    private String journalNumber;
    private LocalDate date;
    private String description;

    @Enumerated(EnumType.STRING)
    private EntryStatus status;

}
