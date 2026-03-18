package org.example.erp_system.service.implementation;

import jakarta.transaction.Transactional;
import org.example.erp_system.dto.BudgetDTO;
import org.example.erp_system.entity.Budget;
import org.example.erp_system.repository.BudgetRepository;
import org.example.erp_system.service.BudgetService;
import org.example.erp_system.util.VarList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public List<BudgetDTO> getAllBudgets() {
        List<Budget> budgets = budgetRepository.findAll();

        return modelMapper.map(budgets, new TypeToken<List<BudgetDTO>>(){}.getType());

    }

    @Override
    public int saveBudget(BudgetDTO budgetDTO) {

        if (budgetRepository.existsById(budgetDTO.getBudgetId())) {
            return VarList.Not_Acceptable;
        }

        Budget budget = modelMapper.map(budgetDTO, Budget.class);

        budgetRepository.save(budget);

        return VarList.Created;

    }

    @Override
    public void updateBudget(BudgetDTO budgetDTO) {

    }

    @Override
    public void deleteBudget(Integer budgetId) {

    }
}
