package org.example.erp_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BudgetDTO {

    private Integer budgetId;
    private BigDecimal plannedAmount;
    private String description;
    private String period;

}
