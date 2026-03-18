package org.example.erp_system.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class JournalEntryLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal amount;
    private String description;

    @Enumerated(EnumType.STRING)
    private EntryType entryType;

    @ManyToOne
    @JoinColumn(name = "journal_entry_id")
    private JournalEntry journalEntry;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private ChartOfAccount account;



}
