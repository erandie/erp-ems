package org.example.erp_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AuditTrail {
    @Id
    private String auditId;
    private String userId;
    private String action;
    private Date timestamp;

}
