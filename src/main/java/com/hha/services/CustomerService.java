package com.hha.services;

import com.hha.entities.Customer;

import java.util.List;

public interface CustomerService {
	Customer createCustomer(Customer c);
	Customer updateCustomer(long id,Customer c);
	void deleteCustomer(long id);
	boolean hidden(long id);
	Customer getCustomerById(long id);
	List<Customer> getAllCustomer();
	List<Customer> getCustomerByText(String txtSearch);
}
