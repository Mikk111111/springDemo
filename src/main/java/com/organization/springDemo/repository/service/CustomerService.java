package com.organization.springDemo.repository.service;

import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }
    public Customer getCustomerByID(Integer id){
        return customerRepository.findById(id).get();
    }
    //====================================================================
    public Customer getMyCustomerByID(int id){
        return customerRepository.findByCustomerNumber(id).get();
    }
    public Customer getMyCustomerByName(String customerName){
        return customerRepository.findByCustomerName(customerName).get();
    }
    public List<Customer> getMyCustomerByNameLike(String partName){
        return (List<Customer>) customerRepository.findByCustomerNameLike(partName);
    }
    public List<Customer> getQueryCustomerByNameLike(String partName){
        return (List<Customer>) customerRepository.getCustomerNameLike(partName);
    }
}
