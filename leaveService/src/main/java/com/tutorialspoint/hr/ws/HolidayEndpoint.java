package com.tutorialspoint.hr.ws;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.jdom.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.tutorialspoint.hr.service.HumanResourceService;

import xsd.model.EmployeeType;
import xsd.model.GetLeaveRequest;
import xsd.model.GetLeaveResponse;

@Endpoint
public class HolidayEndpoint {

	private static final String NAMESPACE_URI = "http://tutorialspoint.com/hr/schemas";
	private HumanResourceService humanResourceService;

	@Autowired
	public HolidayEndpoint(HumanResourceService humanResourceService) throws JDOMException {
		this.humanResourceService = humanResourceService;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLeaveRequest")
	@ResponsePayload
	public GetLeaveResponse handleHolidayRequest(@RequestPayload GetLeaveRequest leaveRequest) throws Exception {
		XMLGregorianCalendar startDate = leaveRequest.getLeave().getStartDate();
		XMLGregorianCalendar endDate = leaveRequest.getLeave().getEndDate();
		String name = leaveRequest.getEmployee().getFirstName();
		String name2 = leaveRequest.getEmployee().getLastName();
		BigInteger empId = leaveRequest.getEmployee().getNumber();

		humanResourceService.bookHoliday(startDate, endDate, name);
		
		GetLeaveResponse response = new GetLeaveResponse();
		EmployeeType emp = new EmployeeType();
		emp.setFirstName(name);
		emp.setLastName(name2);
		emp.setNumber(empId);
		response.setEmployee(emp);
		response.setMessage("Hello " + name + " " + name2 + " your leave has been approved. Enjoy!");
		
		return response;
	}

}