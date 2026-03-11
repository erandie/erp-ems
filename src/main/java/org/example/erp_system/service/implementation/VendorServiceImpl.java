package org.example.erp_system.service.implementation;

import jakarta.transaction.Transactional;
import org.example.erp_system.dto.VendorDTO;
import org.example.erp_system.entity.Vendor;
import org.example.erp_system.repository.VendorRepository;
import org.example.erp_system.service.VendorService;
import org.example.erp_system.util.VarList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class VendorServiceImpl implements VendorService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public List<VendorDTO> getAllVendors() {
        List<Vendor> vendors = vendorRepository.findAll();
        return modelMapper.map(vendors, new TypeToken<List<VendorDTO>>(){}.getType());
    }

    @Override
    public int saveVendors(VendorDTO vendorDTO) {

        if (vendorRepository.existsByEmail(vendorDTO.getEmail())) {
            return VarList.Not_Acceptable;
        }

        Vendor vendor = modelMapper.map(vendorDTO, Vendor.class);

        vendorRepository.save(vendor);

        return VarList.Created;
    }

    @Override
    public void updateVendors(VendorDTO vendorDTO) {

    }

    @Override
    public void deleteVendor(Integer vendorId) {

    }
}
