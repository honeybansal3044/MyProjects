package com.tutorialspoint.hr.service;

public class ServiceFaultException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7624168917012462502L;

	private ServiceFault serviceFault;

	public ServiceFaultException(String message, ServiceFault serviceFault) {
		super(message);
		this.serviceFault = serviceFault;
	}

	public ServiceFaultException(String message, Throwable e, ServiceFault serviceFault) {
		super(message, e);
		this.serviceFault = serviceFault;
	}

	public ServiceFault getServiceFault() {
		return serviceFault;
	}

	public void setServiceFault(ServiceFault serviceFault) {
		this.serviceFault = serviceFault;
	}

}
