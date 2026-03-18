package org.example.erp_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BankTransaction {
    @Id
    private String transactionalNumber;
    private String type;
    private String reference;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private ChartOfAccount account;

}
