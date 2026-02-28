package org.example.erp_system.repository;

import org.example.erp_system.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {

}
