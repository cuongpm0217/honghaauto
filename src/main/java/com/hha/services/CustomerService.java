package com.hha.services;

import java.util.List;

import com.hha.entities.Customer;

public interface CustomerService {
	Customer createCustomer(Customer c);
	Customer updateCustomer(long id,Customer c);
	boolean deleteCustomer(long id);
	Customer getCustomerById(long id);
	List<Customer> getAllCustomer();
	List<Customer> getCustomerByText(String txtSearch);
}
