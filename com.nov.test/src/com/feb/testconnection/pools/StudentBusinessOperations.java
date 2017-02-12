package com.feb.testconnection.pools;

public interface StudentBusinessOperations {

	public int createStudent(Student std) throws Exception;

	public int updateStudent(Student std) throws Exception;

	public int deleteStudent(Student std) throws Exception;

}
