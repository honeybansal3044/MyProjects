package com.feb.testconnection.pools;

public class StudentBusinessOperationsImpl implements StudentBusinessOperations {
	
	private StudentDao dao;

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public int createStudent(Student std) throws Exception {
		return dao.save(std);
	}

	@Override
	public int updateStudent(Student std) throws Exception {
		return dao.update(std);
	}

	@Override
	public int deleteStudent(Student std) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
