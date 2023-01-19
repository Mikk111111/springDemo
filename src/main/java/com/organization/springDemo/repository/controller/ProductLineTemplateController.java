package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.model.ProductLine;
import org.springframework.ui.Model;
import com.organization.springDemo.repository.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/plTemplate")
public class ProductLineTemplateController {
    @Autowired
    private ProductLineService productLineService;
    //http://localhost:8080/plTemplate/firstpage/ships
    @GetMapping(path = "/firstpage/{text}")
    public String getFirstPage(Model model, @PathVariable String text){
        ProductLine productLine = productLineService.getProductLineByID(text);
        model.addAttribute("productline",productLine.getProductLine());
        model.addAttribute("textdescription",productLine.getTextDescription());
        return "/test/firstpage_productlines";
    }
    //http://localhost:8080/plTemplate/firstpage/productLine/all
    @GetMapping(path = "/firstpage/productLine/all")
    public String getAllCustomers(Model model) {
        List<ProductLine> productLineList = productLineService.getAllProductLine();
        model.addAttribute("key_productline_list",productLineList);
        return "/test/firstpage_productlines_list";
    }
}
