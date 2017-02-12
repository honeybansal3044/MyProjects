package com.feb.testconnection.pools;

import java.util.List;

public interface StudentDao {
	
	public int save(Student std) throws Exception;
	public int update(Student std) throws Exception;
	public boolean delete(Student std) throws Exception;
	public Student findByPK(Student std) throws Exception;
	public List<Student> findByName(String name) throws Exception;
	public List<Student> findByEmail(String email) throws Exception;
	public List<Student> findByAddress(String address) throws Exception;
	public List<Student> findByAll() throws Exception;

}
