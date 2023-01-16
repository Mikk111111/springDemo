package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.service.CustomerService;
import lombok.Builder;
import lombok.CustomLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping(path = "/{id}")
    public @ResponseBody Customer getCustomer(@PathVariable Integer id){
        return customerService.getCustomerByID(id);
    }
    @GetMapping(path="/all")
    public @ResponseBody List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @Builder
    public @ResponseBody String lol(){
        return"Err";
    }
}
