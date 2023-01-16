package com.organization.springDemo.repository.bootstrap;

import com.organization.springDemo.repository.CustomerRepository;
import com.organization.springDemo.repository.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductLineRepository productLineRepository;
    @Override
    public void run(String... args) throws Exception {
        //customerRepository.findAll().forEach(System.out::println);
        System.out.println(customerRepository.findById(223));
        //productLineRepository.findAll().forEach(System.out::println);
        System.out.println(productLineRepository.findById("Ships"));
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public ProductLineRepository getProductLineRepository() {
        return productLineRepository;
    }
}
