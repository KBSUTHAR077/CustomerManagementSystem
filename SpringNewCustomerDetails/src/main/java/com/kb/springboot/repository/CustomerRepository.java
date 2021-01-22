package com.kb.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kb.springboot.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{


}
