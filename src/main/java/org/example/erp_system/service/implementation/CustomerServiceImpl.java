package org.example.erp_system.service.implementation;

import jakarta.transaction.Transactional;
import org.example.erp_system.dto.CustomerDTO;
import org.example.erp_system.entity.Customer;
import org.example.erp_system.repository.CustomerRepository;
import org.example.erp_system.service.CustomerService;
import org.example.erp_system.util.VarList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return modelMapper.map(customers, new TypeToken<List<CustomerDTO>>(){}.getType());
    }

    @Override
    public int saveCustomer(CustomerDTO customerDTO) {
        if (customerRepository.existsByEmail(customerDTO.getEmail())){
            return VarList.Not_Acceptable;
        }

        Customer customer = modelMapper.map(customerDTO, Customer.class);

        customerRepository.save(customer);

        return VarList.Created;

    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(Integer customerId) {

    }
}
