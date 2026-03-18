package org.example.erp_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
//    private Vendor vendor;
    private Date date;
    String terms;

    private boolean approved = false;

    @OneToOne
    @JoinColumn(name = "journal_entry_id")
    private JournalEntry journalEntry;



}
