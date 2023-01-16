package com.organization.springDemo.repository.service;

import com.organization.springDemo.repository.ProductLineRepository;
import com.organization.springDemo.repository.model.ProductLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class ProductLineService {
    @Autowired
    private ProductLineRepository productLineRepository;
    public List<ProductLine> getAllCustomers(){

        return (List<ProductLine>) productLineRepository.findAll();
    }
    public ProductLine getProductLineByID(String id){
        return productLineRepository.findById(id).get();
    }
}
