package org.example.erp_system.controller;

import org.example.erp_system.dto.BudgetDTO;
import org.example.erp_system.service.implementation.BudgetServiceImpl;
import org.example.erp_system.util.ResponseUtil;
import org.example.erp_system.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/budget")
@CrossOrigin
public class BudgetController {

    @Autowired
    private BudgetServiceImpl budgetService;

    @GetMapping("/get")
    public List<BudgetDTO> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

    @PostMapping("/save")
    public ResponseEntity<ResponseUtil> saveBudget(@RequestBody BudgetDTO budgetDTO) {

        int res = budgetService.saveBudget(budgetDTO);

        if (res == VarList.Created) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseUtil(201, "Budget added successfully!", null));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .body(new ResponseUtil(206, "Cant add!", null));
        }

    }


}
