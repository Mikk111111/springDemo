package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.bootstrap.BootStrapData;
import jakarta.websocket.OnError;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/customermapping")
public class CustomerController {
    BootStrapData bootStrapData = new BootStrapData();
    @GetMapping(path = "/customer")
    public @ResponseBody String getCustomer() throws Exception {
        CommandLineRunner commandLineRunner = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                bootStrapData.getCustomerRepository().findAll().forEach(System.out::println);
            }
        };
        return "EERRROR";
    }

}
