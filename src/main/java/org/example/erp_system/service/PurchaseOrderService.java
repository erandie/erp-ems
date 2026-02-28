package org.example.erp_system.service;

//import org.example.erp_system.dto.PurchaseOrderDTO;
import org.example.erp_system.entity.PurchaseOrder;
import org.example.erp_system.repository.PurchaseOrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private ModelMapper modelMapper;

//    public PurchaseOrderDTO create(PurchaseOrderDTO purchaseOrderDTO) {
//        PurchaseOrder purchaseOrder = modelMapper.map(purchaseOrderDTO, PurchaseOrder.class);
//        PurchaseOrder saved = purchaseOrderRepository.save(purchaseOrder);
//        return modelMapper.map(saved, PurchaseOrderDTO.class);
//    }



}
