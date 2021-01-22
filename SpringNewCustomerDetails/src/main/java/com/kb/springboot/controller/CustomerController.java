package com.kb.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kb.springboot.service.CustomerService;
import com.kb.springboot.model.Customer;

@Controller
public class CustomerController {
	// display list of customer

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listCustomers",customerService.getAllCustomers());
		return "index";		
	}

	@GetMapping("/showNewCustomerForm")
	public String showNewCustomerForm(Model model) {
		// create model attribute to bind form data
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "new_customer";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		// save customer to database
		customerService.saveCustomer(customer);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") int id, Model model) {
		
		// get customer from the service
		Customer customer = customerService.getCustomerById(id);
		
		// set customer as a model attribute to pre-populate the form
		model.addAttribute("customer", customer);
		return "update_customer";
	}

	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable (value = "id") int id) {
		
		// call delete customer method 
		this.customerService.deleteCustomerById(id);
		return "redirect:/";
	}
}
