package com.calculator.service;

import java.net.URL;

import org.apache.axis.client.Service;

public class TestClient {

	public static void main(String[] args) throws Exception {

		URL endpoint = new URL("http://localhost:8080/CalulatorService/services/CalService");
		Service service = new Service();
		
		CalServiceSoapBindingStub client = new CalServiceSoapBindingStub(endpoint, service);
		System.out.println(client.add(10, 10));
		
	}

}
