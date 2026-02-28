package org.example.erp_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invoice {
    @Id
    private String invoiceNumber;
    private Customer customer;
//    private List<String> items = new ArrayList<>();
    private BigDecimal totalAmount;
    private int taxRate;
    private int discount;

}
