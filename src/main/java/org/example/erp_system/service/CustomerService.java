package org.example.erp_system.service;

import org.example.erp_system.dto.CustomerDTO;
import org.example.erp_system.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    int saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Integer customerId);

}
