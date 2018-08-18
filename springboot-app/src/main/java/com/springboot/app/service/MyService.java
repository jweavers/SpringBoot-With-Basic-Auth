package com.springboot.app.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.entity.Customer;
import com.springboot.app.repository.MyRepository;

@Service
public class MyService {

	@Autowired
	private MyRepository repository;
	
	public String save (Customer customer)
	{
		repository.save(customer);
		return "Added Successfully !!";
	}
	
	public String saveAll (List<Customer> customers)
	{
		repository.saveAll(customers);
		return "Added Successfully !!";
	}
	
	public Customer getCustomer (String customerId)
	{
		return repository.findById(customerId).get();
	}
	
	public List<Customer> getCustomers ()
	{
		List<Customer> lst = new LinkedList<>();
		repository.findAll().forEach(lst::add);
		return lst;
	}
}
