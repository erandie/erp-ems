package org.example.erp_system.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.erp_system.entity.Customer;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceDTO {
    private String invoiceNumber;
    private Customer customer;
    //    private List<String> items = new ArrayList<>();
    private BigDecimal totalAmount;
    private int taxRate;
    private int discount;

}
