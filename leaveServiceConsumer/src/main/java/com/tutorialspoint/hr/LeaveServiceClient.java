package com.tutorialspoint.hr;

import java.math.BigInteger;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import xsd.model.EmployeeType;
import xsd.model.GetLeaveRequest;
import xsd.model.GetLeaveResponse;
import xsd.model.LeaveType;

public class LeaveServiceClient extends WebServiceGatewaySupport {

	public GetLeaveResponse getLeaveServiceResponse() {
		GetLeaveRequest request = new GetLeaveRequest();
		EmployeeType emp = new EmployeeType();
		emp.setFirstName("Honey");
		emp.setLastName("Bansal");
		emp.setNumber(new BigInteger("10"));
		request.setEmployee(emp);
		request.setLeave(new LeaveType());

		String uri = "http://localhost:8080/leaveService/";
		GetLeaveResponse response = (GetLeaveResponse) getWebServiceTemplate().marshalSendAndReceive(uri, request);

		return response;
	}
}