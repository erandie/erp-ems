package org.example.erp_system.service;

import org.example.erp_system.dto.VendorDTO;

import java.util.List;

public interface VendorService {

    List<VendorDTO> getAllVendors();
    int saveVendors(VendorDTO vendorDTO);
    void updateVendors(VendorDTO vendorDTO);
    void deleteVendor(Integer vendorId);

}
