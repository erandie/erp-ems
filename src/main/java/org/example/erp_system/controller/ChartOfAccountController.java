package org.example.erp_system.controller;

import org.example.erp_system.dto.ChartOfAccountDTO;
import org.example.erp_system.service.implementation.ChartOfAccountServiceImpl;
import org.example.erp_system.util.ResponseUtil;
import org.example.erp_system.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
@CrossOrigin
@Validated
public class ChartOfAccountController {
    @Autowired
    private ChartOfAccountServiceImpl chartOfAccountService;

    @GetMapping("/get")
    public List<ChartOfAccountDTO> getAllAccounts(){
        return chartOfAccountService.getAllAccounts();
    }

    @PostMapping("/save")
    public ResponseEntity<ResponseUtil> saveAccounts(@RequestBody ChartOfAccountDTO accountDTO){

        int res = chartOfAccountService.saveAccount(accountDTO);

        if (res == VarList.Created){
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseUtil(201, "Account Saved Successfully", null));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .body(new ResponseUtil(406, "Id Already Exists!", null));
        }

    }


}
