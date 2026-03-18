package org.example.erp_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class ChartOfAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private String accountCode;
    private String accountName;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @OneToMany(mappedBy = "account")
    private List<JournalEntryLine> journalEntryLines;

    @OneToMany(mappedBy = "account")
    private List<BankTransaction> bankTransactions;

    @OneToMany(mappedBy = "account")
    private List<Budget> budgets;

    @OneToMany(mappedBy = "account")
    private List<FixedAsset> fixedAssets;

}
