package com.kb.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.kb.springboot.model.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public void saveCustomer(Customer costomer);
	public Customer getCustomerById(int id);
	public void deleteCustomerById(int id);
}
