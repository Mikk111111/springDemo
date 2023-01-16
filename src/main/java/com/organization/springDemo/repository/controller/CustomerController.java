package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.CustomerRepository;
import com.organization.springDemo.repository.bootstrap.BootStrapData;
import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.service.CustomerService;
import jakarta.websocket.OnError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/customermapping")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping(path = "/customer")
    public @ResponseBody String getCustomer() throws Exception {

        return "EERRROR";
    }
    @GetMapping(path="/customermapping/all")
    public @ResponseBody List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
