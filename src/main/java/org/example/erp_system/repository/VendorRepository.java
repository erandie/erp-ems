package org.example.erp_system.repository;

import org.example.erp_system.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

    @Override
    Optional<Vendor> findById(Integer vendorId);

    boolean existsByEmail(String vendorName);
}
