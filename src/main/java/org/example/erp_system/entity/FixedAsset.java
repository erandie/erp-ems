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
public class FixedAsset {
    @Id
    private String assetId;
    private String category;
    private Date purchaseDate;
    private int cost;
    private String depreciationMethod;
}
