package org.example.erp_system.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Budget {
    @Id
    private String budgetId;
    private String period;

    @ElementCollection // JPA doesn’t know how to save a List<String> on its own.
    private List<String> items = new ArrayList<>();
}
