package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.entity.Customer;
import com.springboot.app.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService service;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String getResponse(@RequestBody Customer customer)
	{
		return service.save(customer);
	}
	
	@RequestMapping(value="/addAll", method=RequestMethod.POST)
	public String getResponse(@RequestBody List<Customer> customer)
	{
		return service.saveAll(customer);
	}
	
	@RequestMapping(value="/get/{customerId}")
	public Customer getResponse(@PathVariable String customerId)
	{
		return service.getCustomer(customerId);
	}
	
	@RequestMapping(value="/getAll")
	public List<Customer> getResponse()
	{
		return service.getCustomers();
	}
}
