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
    BootStrapData bootStrapData = new BootStrapData();
    @GetMapping(path = "/productline")
    public @ResponseBody String getProductLine() throws Exception {
        CommandLineRunner commandLineRunner = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                bootStrapData.getProductLineRepository().findAll().forEach(System.out::println);
            }
        };
        return "EERRROR";
    }
}
