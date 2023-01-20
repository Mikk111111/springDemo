package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
    public String getFirstAllCustomers(Model model) {
        List<Customer> customersList = customerService.getAllCustomers();
        model.addAttribute("key_customers_list",customersList);
        return "/test/firstpage_customers_list";
    }
    //http://localhost:8080/cTemplate/customer/112
    @GetMapping(path = "/customer/{id}")
    public String getCustomer(Model model, @PathVariable int id){
        Customer customer = customerService.getMyCustomerByID(id);
        model.addAttribute("key_customer", customer);
        return "/customer/customer_th";
    }
    //http://localhost:8080/cTemplate/main/customertable/all

    @GetMapping(path = "/main/customertable/all")
    public String getAllCustomers(Model model) {
        List<Customer> customersList = customerService.getAllCustomers();
        model.addAttribute("listas",customersList);
        return "/customers/customers_th";
    }
    //================================================================================================================
    //http://localhost:8080/cTemplate/main//jquerypage
    @GetMapping(path = "/main/jquerypage")
    public String getJqueryPage(){
        return "/test/jquerypage";
    }
    //cTemplate/main/jquerypage/search
    @RequestMapping(value = "/main/jquerypage/search",method = RequestMethod.GET)
    public String getJqueryPageSearch(Model model){
        model.addAttribute("key_customer",new Customer());
        model.addAttribute("key_customer_listas", Collections.emptyList());
        return "/customer/post_get_customers_th";
    }
    @RequestMapping(value = "/main/jquerypage/search",method = RequestMethod.POST)
    public String postJqueryPageSearch(Model model, @ModelAttribute Customer customer){
        model.addAttribute("key_customer",new Customer());
        model.addAttribute("key_customer_listas",Collections.emptyList());
        return "/customer/post_get_customers_th";
    }
}
