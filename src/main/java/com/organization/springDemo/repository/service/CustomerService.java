package com.organization.springDemo.repository.service;

import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }
}
