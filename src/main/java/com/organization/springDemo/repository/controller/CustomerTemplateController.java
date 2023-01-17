package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
