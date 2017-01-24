package com.jan.test.SpringBeanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DBConnect implements InitializingBean, DisposableBean {

	private Connection con;
	private String driver, url, username, pwd;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, pwd);
		System.out.println("Connection Opened");

	}

	public void save(int messageId, String message, int nextMassage) throws SQLException {
		PreparedStatement ps = con.prepareStatement("Insert into messages values (?,?,?)");
		ps.setInt(1, messageId);
		ps.setString(2, message);
		ps.setInt(3, nextMassage);
		int id = ps.executeUpdate();
		System.out.println("Data inserted with id = " + id);
	}

	@Override
	public void destroy() throws Exception {
		con.close();
		System.out.println("Connection Closed");
	}

}
