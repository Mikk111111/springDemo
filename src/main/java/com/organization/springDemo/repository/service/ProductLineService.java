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
    public List<ProductLine> getAllProductLine(){

        return (List<ProductLine>) productLineRepository.findAll();
    }
    public ProductLine getProductLineByID(String id){
        return productLineRepository.findById(id).get();
    }
    //====================================================================
    public ProductLine getProductLineByName(String productLine){
        return productLineRepository.findByProductLine(productLine).get();
    }
    public ProductLine getProductLineByTextDescription(String textDescription){
        return productLineRepository.findByTextDescription(textDescription).get();
    }
    public List<ProductLine> getMyProductLineByNameLike(String partName){
        return (List<ProductLine>) productLineRepository.findByProductLineLike(partName);
    }
    public List<ProductLine> getMyProductLineByTextDescriptionLike(String desc){
        return (List<ProductLine>) productLineRepository.findByTextDescriptionLike(desc);
    }
    public List<ProductLine> getQueryProductLineByNameLike(String part){
        return productLineRepository.getProductLineByNameLike(part);
    }
}
