package com.se.resource;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.se.model.Customer;

@Path("/billing")
public class BillingService {

	@GET
	@Path("/customer/{customerCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getBillingDetails(@PathParam("customerCode")String customerCode){
		
		return null;
	}
	
	
	
	@PUT
	@Path("/customer/{customerCode}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateBillingDetails(@PathParam("customer") String billingInfo){
		
	}
}
