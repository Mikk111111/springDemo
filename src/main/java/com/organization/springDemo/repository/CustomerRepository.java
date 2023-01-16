package com.organization.springDemo.repository;

import com.organization.springDemo.repository.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
