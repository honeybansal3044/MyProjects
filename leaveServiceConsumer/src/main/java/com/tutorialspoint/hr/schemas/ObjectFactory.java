//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.16 at 02:23:57 PM CDT 
//


package com.tutorialspoint.hr.schemas;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tutorialspoint.hr.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tutorialspoint.hr.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLeaveRequest }
     * 
     */
    public GetLeaveRequest createGetLeaveRequest() {
        return new GetLeaveRequest();
    }

    /**
     * Create an instance of {@link LeaveType }
     * 
     */
    public LeaveType createLeaveType() {
        return new LeaveType();
    }

    /**
     * Create an instance of {@link EmployeeType }
     * 
     */
    public EmployeeType createEmployeeType() {
        return new EmployeeType();
    }

    /**
     * Create an instance of {@link GetLeaveResponse }
     * 
     */
    public GetLeaveResponse createGetLeaveResponse() {
        return new GetLeaveResponse();
    }

}
