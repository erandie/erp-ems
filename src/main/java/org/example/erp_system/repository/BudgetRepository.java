package org.example.erp_system.repository;

import org.example.erp_system.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {

    Budget findByBudgetId(Integer budgetId);

}
