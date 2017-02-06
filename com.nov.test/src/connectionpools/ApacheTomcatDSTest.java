package connectionpools;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class ApacheTomcatDSTest {

	public static void main(String[] args) {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/test");
		bds.setUsername("root");
		bds.setPassword("root");
		bds.setMaxTotal(10);
		bds.setMaxIdle(5);
		bds.setMaxWaitMillis(5000);
		
		for(int i=0; i<10;i++) {
			try {
				Connection con = bds.getConnection();
				System.out.println(con);
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
