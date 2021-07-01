package com.galvanize.springdatajpa.h2.springjpah2.repository;

import com.galvanize.springdatajpa.h2.springjpah2.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
