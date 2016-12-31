package com.se.resource;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.se.dao.CustomerDao;
import com.se.dao.CustomerDaoImpl;
import com.se.model.Customer;
import com.se.util.CustomerHelper;

@Path("/customer")
public class CustomerService {
	
	private static CustomerDao customerDao= new CustomerDaoImpl();

	@GET
	@Path("/{customerCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerDetails(@PathParam("customerCode")String customerCode){
		Customer customer = customerDao.getCustomer(customerCode);
		return customer;
	}
	
	@POST
	@Path("/register")
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerCustomer(@PathParam("customer") String customerJson){
		if(null==customerJson){
			//return response
		}
		Customer customer = CustomerHelper.convertJsonToCustomer(customerJson);
		customerDao.saveCustomer(customer);
		//return response
	}
	
	@PUT
	@Path("/reset/password")
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateCustomerDetails(@PathParam("customer") String customer){
		
	}
}
