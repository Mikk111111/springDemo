package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.bootstrap.BootStrapData;
import com.organization.springDemo.repository.model.ProductLine;
import com.organization.springDemo.repository.service.CustomerService;
import com.organization.springDemo.repository.service.ProductLineService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;
import java.io.*;
import java.net.URLDecoder;
import java.util.List;

@Controller
@RequestMapping(path="/product_line")
public class ProductLineController {
    @Autowired
    private ProductLineService productLineService;
    @GetMapping(path="/all")
    public @ResponseBody List<ProductLine> getAllProductLine(){

        return productLineService.getAllCustomers();
    }
    @GetMapping(path = "/{id}")
    public  @ResponseBody ProductLine getProductLine(@PathVariable String id){
        return productLineService.getProductLineByID(id);
    }

}
