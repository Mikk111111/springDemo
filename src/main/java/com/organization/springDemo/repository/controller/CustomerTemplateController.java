package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/cTemplate")
public class CustomerTemplateController {
    @Autowired
    private CustomerService customerService;

    //http://localhost:8080/cTemplate/firstpage/112
    @GetMapping(path = "/firstpage/{id}")
    public String getFirstPage(Model model, @PathVariable int id) {
        Customer customer = customerService.getMyCustomerByID(id);
        model.addAttribute("company_name", customer.getContactFirstName());
        model.addAttribute("contact_first_name", customer.getContactFirstName());
        model.addAttribute("contact_last_name", customer.getContactLastName());
        model.addAttribute("country", customer.getCountry());
        return "/test/firstpage_customer";
    }

    //http://localhost:8080/cTemplate/firstpage/customer/all
    @GetMapping(path = "/firstpage/customer/all")
    public String getAllCustomers(Model model) {
        List<Customer> customersList = customerService.getAllCustomers();
        model.addAttribute("key_customers_list",customersList);
        return "/test/firstpage_customers_list";
    }
}
