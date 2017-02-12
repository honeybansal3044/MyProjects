package com.feb.testconnection.pools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImplJDBC implements StudentDao {
	
	private DataSource ds;
	
	private JdbcTemplate jdbcTemplate;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int save(Student std) throws Exception {
		Connection con = this.ds.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1, std.getId());
		ps.setString(2, std.getName());
		ps.setString(3, std.getEmail());
		ps.setString(4, std.getAddress());
		int id = ps.executeUpdate();
		con.close();
		return id;
	}

	@Override
	public int update(Student std) throws Exception {
		return this.jdbcTemplate.update("insert into student values(?,?,?,?)", new Object[] { std.getId(),std.getName(),std.getEmail(), std.getAddress()});
	}

	@Override
	public boolean delete(Student std) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findByPK(Student std) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByAddress(String address) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
