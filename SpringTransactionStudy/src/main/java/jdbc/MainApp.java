package jdbc;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		
		CorporateEventDao dao = (CorporateEventDao) ctx.getBean(CorporateEventDao.class);
		//dao.createTable();
		dao.insertEvent(1, "Birthday");
		dao.insertEvent(2, "Marriage");
		
		dao.updateEvent(2, "Marriageday");
		
		dao.deleteEvent(2);
		
		List<Map<String, Object>> events = dao.getEventList();
		System.out.println(events.get(0).get("id"));
		System.out.println(events.get(0).get("name"));
		
		((ClassPathXmlApplicationContext) ctx).close();
		
		DataSource ds = new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
		        .addScript("classpath:/schema.sql")
		        .addScript("classpath:/test-data.sql")
		        .build();
		
		JdbcTemplate template = new JdbcTemplate(ds);
		List<Map<String, Object>> list = template.queryForList("select * from Things ");
		System.out.println(list.get(0).get("name"));
		
		
	}
}
