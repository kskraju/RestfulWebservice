package com.productrest.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class AddProductTest {

  public static void main(String[] args) {
	try {

		Client client = Client.create();

		WebResource webResource = client
		   .resource("http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/ProductService/product/addProduct");

		String input = "{\"productId\": \"0001\",\"productName\": \"Middies\",\"productDesc\": \"Middies for Girls\",\"productPrice\": \"20.27\",\"productQuantity\": \"100\"}";
	    
		ClientResponse response = webResource.type("application/json")
		   .post(ClientResponse.class, input);

		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}

		System.out.println("Output from Server .... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);

	  } catch (Exception e) {

		e.printStackTrace();

	  }

	}
}