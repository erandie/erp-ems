package org.example.erp_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PurchaseOrder {
    @Id
    private String poNumber;
    private Vendor vendor;
    private Date date;
    String terms;

    private boolean approved = false;

    public void markAsApproved(){
        this.approved = true;
    }

}
