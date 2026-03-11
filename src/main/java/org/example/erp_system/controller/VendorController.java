package org.example.erp_system.controller;

import org.example.erp_system.dto.VendorDTO;
import org.example.erp_system.service.implementation.VendorServiceImpl;
import org.example.erp_system.util.ResponseUtil;
import org.example.erp_system.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vendor")
@CrossOrigin
@Validated
public class VendorController {

    @Autowired
    private VendorServiceImpl vendorService;

    @GetMapping("/get")
    public List<VendorDTO> getAllVendors(){
        return vendorService.getAllVendors();
    }

    @PostMapping("/save")
    public ResponseEntity<ResponseUtil> saveVendor(@RequestBody VendorDTO vendorDTO) {
        int res = vendorService.saveVendors(vendorDTO);

        if (res == VarList.Created) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseUtil(201, "Vendor Saved Successfully! :)", null));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .body(new ResponseUtil(406, "Vendor lready exist! Try with a new Vendor! :)", null));
        }

    }


}






























