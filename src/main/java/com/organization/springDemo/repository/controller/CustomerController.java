package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    //====================================================================
    @GetMapping(path = "/mine/{id}")
    public @ResponseBody Customer getMyCustomerById(@PathVariable Integer id){
        return customerService.getMyCustomerByID(id);
    }
    @GetMapping(path = "/full/{customerName}")
    public @ResponseBody Customer getMyCustomerByName(@PathVariable String customerName){
        return customerService.getMyCustomerByName(customerName);
    }
    @GetMapping(path = "/like/{partName}")
    public @ResponseBody List<Customer> getMyCustomerByNameLike(@PathVariable String partName){
        return customerService.getMyCustomerByNameLike("%"+partName+"%");
    }
    //http://localhost:8080/customer/query/sa
    @GetMapping(path = "/query/{partName}")
    public @ResponseBody List<Customer> getQueryCustomerByNameLike(@PathVariable String partName){
        return customerService.getQueryCustomerByNameLike("%"+partName+"%");
    }
    //http://localhost:8080/customer/mine/number?customerNumber=112
    @GetMapping(path = "/mine/number")
    public @ResponseBody Customer getMyCustomerByIdWthRequestParam(@RequestParam Integer customerNumber) {
        return customerService.getMyCustomerByID(customerNumber);
    }
}
