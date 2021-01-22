package com.kb.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kb.springboot.model.Customer;
import com.kb.springboot.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
		@Override
		public void saveCustomer(Customer customer) {
			this.customerRepository.save(customer);
		}

		@Override
		public Customer getCustomerById(int id) {
			Optional<Customer> optional = customerRepository.findById(id);
			Customer customer = null;
			if (optional.isPresent()) {
				customer = optional.get();
			} else {
				throw new RuntimeException(" Customer not found for id :: " + id);
			}
			return customer;
		}

		@Override
		public void deleteCustomerById(int id) {
			this.customerRepository.deleteById(id);
		}

		
		}
	
