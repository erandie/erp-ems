package org.example.erp_system.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.erp_system.entity.AccountType;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChartOfAccountDTO {
    private Integer accountId;
    private String accountCode;
    private String accountName;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;
}
