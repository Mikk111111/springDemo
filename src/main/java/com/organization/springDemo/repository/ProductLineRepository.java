package com.organization.springDemo.repository;

import com.organization.springDemo.repository.model.ProductLine;
import org.springframework.data.repository.CrudRepository;

public interface ProductLineRepository extends CrudRepository<ProductLine,String> {
}
