package com.tutorialspoint.hr;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import xsd.model.GetLeaveResponse;

public class App {
	public static void main(String[] args) {
		LeaveServiceClient client = new LeaveServiceClient();
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("xsd.model");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		GetLeaveResponse response = client.getLeaveServiceResponse();
		
		System.out.println(response.getMessage());
	}
}
