package org.example.erp_system.controller;

import org.example.erp_system.dto.InvoiceDTO;
import org.example.erp_system.service.implementation.InvoiceServiceImpl;
import org.example.erp_system.util.ResponseUtil;
import org.example.erp_system.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/invoice")
@CrossOrigin
@Validated
public class InvoiceController {

    @Autowired
    private InvoiceServiceImpl invoiceService;

    @GetMapping("/get")
    public List<InvoiceDTO> getAllInvoice(){
        return invoiceService.getAllInvoices();
    }

    @PostMapping("/save")
    public ResponseEntity<ResponseUtil> saveInvoices(@RequestBody InvoiceDTO invoiceDTO){

        int res = invoiceService.saveInvoice(invoiceDTO);

        if (res == VarList.Created){
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseUtil(201, "Invoice Details Saved Successfully!", null));

        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .body(new ResponseUtil(406, "Invoice Id Already Exists!", null));
        }

    }

}
