package org.example.erp_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
