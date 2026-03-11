package org.example.erp_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VendorDTO {
    private Integer vendorId;
    private String vendorName;
    private String email;
    private String phoneNumber;
    private String address;
    private String taxNumber;
    private String bankAccountNumber;
    private String bankName;

}
