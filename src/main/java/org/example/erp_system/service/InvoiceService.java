package org.example.erp_system.service;

import org.example.erp_system.dto.InvoiceDTO;

import java.util.List;

public interface InvoiceService {
    List<InvoiceDTO> getAllInvoices();

    int saveInvoice(InvoiceDTO invoiceDTO);

    void updateInvoice(InvoiceDTO invoiceDTO);

    void deleteInvoice(Integer invoiceId);

}
