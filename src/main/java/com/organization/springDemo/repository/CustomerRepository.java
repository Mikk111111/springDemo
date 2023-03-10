package com.organization.springDemo.repository;

import com.organization.springDemo.repository.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    //Spring can read method names and find by them
    Optional<Customer> findByCustomerNumber(int id);
    Optional<Customer> findByCustomerName(String customerName);
    Iterable<Customer> findByCustomerNameLike(String customerName);
    @Query(value = "SELECT * FROM customers WHERE customerName LIKE :name",nativeQuery = true)
    List<Customer> getCustomerNameLike(@Param("name") String customerName);
}
