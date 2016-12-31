package com.se.dao;

import java.util.List;

import com.se.model.Customer;

public interface CustomerDao {
	public void saveCustomer(Customer customer);
	public List<Customer> getAllCustomers(Customer customer);
	public Customer getCustomer(String customerCode);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(Customer customer);


}
