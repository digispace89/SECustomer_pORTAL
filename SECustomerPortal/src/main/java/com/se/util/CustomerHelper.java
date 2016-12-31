package com.se.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.se.model.Customer;

public class CustomerHelper {
 
	
	public static Customer convertJsonToCustomer(String customerJson){
		
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = null;
		try {
			customer  = mapper.readValue(customerJson, Customer.class);
			System.out.println(customer.toString());

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return customer;
	}
}
