package com.tutorialspoint.hr.service;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class HumanResourceServiceImpl implements HumanResourceService {

	static Logger log = Logger.getLogger(HumanResourceServiceImpl.class.getName());

	public void bookHoliday(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate, String name) {
		System.out.println("Booking holiday for [" + startDate + "-" + endDate + "] for [" + name + "] ");
		log.info("Going to create HelloWord Obj");
	}
}