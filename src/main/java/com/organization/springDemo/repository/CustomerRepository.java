package com.organization.springDemo.repository;

import com.organization.springDemo.repository.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
