package org.example.erp_system.service.implementation;

import jakarta.transaction.Transactional;
import org.example.erp_system.dto.InvoiceDTO;
import org.example.erp_system.entity.Invoice;
import org.example.erp_system.repository.InvoiceRepository;
import org.example.erp_system.service.InvoiceService;
import org.example.erp_system.util.VarList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public List<InvoiceDTO> getAllInvoices() {
        List<Invoice> invoices = invoiceRepository.findAll();
        return modelMapper.map(invoices, new TypeToken<List<InvoiceDTO>>(){}.getType());
    }

    @Override
    public int saveInvoice(InvoiceDTO invoiceDTO) {

        if (invoiceRepository.existsById(invoiceDTO.getInvoiceNumber())){
            return VarList.Not_Acceptable;
        }

        Invoice invoice = modelMapper.map(invoiceDTO, Invoice.class);

        invoiceRepository.save(invoice);

        return VarList.Created;

    }

    @Override
    public void updateInvoice(InvoiceDTO invoiceDTO) {

    }

    @Override
    public void deleteInvoice(Integer invoiceId) {

    }
}
