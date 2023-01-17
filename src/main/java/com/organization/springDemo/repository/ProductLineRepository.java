package com.organization.springDemo.repository;

import com.organization.springDemo.repository.model.ProductLine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;

public interface ProductLineRepository extends CrudRepository<ProductLine,String> {

    Optional<ProductLine> findByProductLine(String productLine);
    Optional<ProductLine> findByTextDescription(String textDescription);
    Iterable<ProductLine> findByProductLineLike(String productLine);
    Iterable<ProductLine> findByTextDescriptionLike(String productLine);
    @Query(value = "SELECT productLine,textDescription FROM classicmodels.productlines WHERE productline LIKE :text",nativeQuery = true)
    List<ProductLine> getProductLineByNameLike(@Param("text") String textDescription);
}