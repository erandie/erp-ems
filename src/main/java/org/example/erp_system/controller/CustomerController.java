package org.example.erp_system.controller;

import org.aspectj.weaver.ast.Var;
import org.example.erp_system.dto.CustomerDTO;
import org.example.erp_system.service.implementation.CustomerServiceImpl;
import org.example.erp_system.util.ResponseUtil;
import org.example.erp_system.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
@Validated
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/get")
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping("/save")
    public ResponseEntity<ResponseUtil> saveCustomers(@RequestBody CustomerDTO customerDTO) {
        int res = customerService.saveCustomer(customerDTO);

        if (res == VarList.Created) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseUtil(201, "User Saved Successfully!", null));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .body(new ResponseUtil(406, "Email already exist", null));
        }

    }


}
