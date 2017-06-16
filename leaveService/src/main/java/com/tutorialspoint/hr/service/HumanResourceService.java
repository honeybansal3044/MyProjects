package com.tutorialspoint.hr.service;

import javax.xml.datatype.XMLGregorianCalendar;

public interface HumanResourceService {
	void bookHoliday(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate, String name);
}
