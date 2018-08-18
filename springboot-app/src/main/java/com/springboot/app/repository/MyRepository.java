package com.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.entity.Customer;

@Repository
public interface MyRepository extends CrudRepository<Customer,String> {

}
