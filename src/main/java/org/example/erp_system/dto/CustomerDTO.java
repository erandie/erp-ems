package org.example.erp_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    private Integer customerId;
    private String name;
    private String address;
    private String contact;
    private String email;

}
