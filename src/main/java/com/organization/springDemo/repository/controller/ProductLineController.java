package com.organization.springDemo.repository.controller;

import com.organization.springDemo.repository.model.Customer;
import com.organization.springDemo.repository.model.ProductLine;
import com.organization.springDemo.repository.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping(path="/productLine")
public class ProductLineController {
    @Autowired
    private ProductLineService productLineService;
    @GetMapping(path="/all")
    public @ResponseBody List<ProductLine> getAllProductLine(){

        return productLineService.getAllProductLine();
    }
    @GetMapping(path = "/{id}")
    public  @ResponseBody ProductLine getProductLine(@PathVariable String id){
        return productLineService.getProductLineByID(id);
    }
    //====================================================================
    @GetMapping(path = "/full/{name}")
    public @ResponseBody ProductLine getProductLineByName(@PathVariable String name){
        return productLineService.getProductLineByName(name);
    }
    @GetMapping(path = "full/desc/{desc}")
    public @ResponseBody ProductLine getProductLineByTextDescription(@PathVariable String desc){
        return productLineService.getProductLineByTextDescription(desc);
    }
    //http://localhost:8080/productLine/like/name/ha
    @GetMapping(path = "/like/name/{partName}")
    public @ResponseBody List<ProductLine> getMyProductLineByNameLike(@PathVariable String partName){
        return productLineService.getMyProductLineByNameLike("%"+partName+"%");
    }
    //http://localhost:8080/productLine/like/desc/ha
    @GetMapping(path = "/like/desc/{partName}")
    public @ResponseBody List<ProductLine> getMyProductLineByTextDescriptionLike(@PathVariable String partName){
        return productLineService.getMyProductLineByTextDescriptionLike("%"+partName+"%");
    }
    //http://localhost:8080/productLine/query/name/p
    @GetMapping(path = "/query/name/{partName}")
    public @ResponseBody List<ProductLine> getQueryProductLineByNameLike(@PathVariable String partName){
        return productLineService.getQueryProductLineByNameLike("%"+partName+"%");
    }
}
