package com.tutorialspoint.hr.service;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

@Service
public class HumanResourceServiceImpl implements HumanResourceService {
	public void bookHoliday(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate, String name) {
		System.out.println("Booking holiday for [" + startDate + "-" + endDate + "] for [" + name + "] ");
	}
}