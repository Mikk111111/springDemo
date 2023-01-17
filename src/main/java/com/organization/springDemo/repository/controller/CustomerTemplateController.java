package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/customertemplate")
public class CustomerTemplateController {
    @Autowired
    private CustomerService customerService;
    //http://localhost:8080/customertemplate/test
    @GetMapping(path="/test")
    public String get(){
        return "test/test_page";
    }
    //http://localhost:8080/customertemplate/firspage/customer/112
    @GetMapping(path="/firspage/customer/{id}")
    public String getFirstPage(Model model, @PathVariable int id){
        Customer customer = customerService.getMyCustomerByID(id);
        model.addAttribute("company_name",customer.getContactFirstName());
        model.addAttribute("contact_first_name",customer.getContactLastName());
        model.addAttribute("country",customer.getCountry());
        return "test/firstpage";
    }
}
