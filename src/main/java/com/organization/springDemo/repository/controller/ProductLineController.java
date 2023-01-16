package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.bootstrap.BootStrapData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/productlinemapping")
public class ProductLineController {
    @GetMapping(path = "/productline")
    public @ResponseBody String getProductLine() throws Exception {

        return "EERRROR";
    }
}
