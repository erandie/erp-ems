package org.example.erp_system.service;

import org.example.erp_system.dto.BudgetDTO;

import java.util.List;

public interface BudgetService {

    List<BudgetDTO> getAllBudgets();

    int saveBudget(BudgetDTO budgetDTO);

    void updateBudget(BudgetDTO budgetDTO);

    void deleteBudget(Integer budgetId);

}
