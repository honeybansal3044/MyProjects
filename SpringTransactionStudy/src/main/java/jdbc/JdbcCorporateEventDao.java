package jdbc;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCorporateEventDao implements CorporateEventDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void createTable() {
		this.jdbcTemplate.execute("create table event (id integer, name varchar(100))");
	}

	@Override
	public void insertEvent(int id, String name) {
		this.jdbcTemplate.update("insert into event (id, name) values (?, ?)", id, name);
	}

	@Override
	public void updateEvent(int id, String name) {
		this.jdbcTemplate.update("update event set name = ? where id = ?", name, id);

	}

	@Override
	public void deleteEvent(int id) {
		this.jdbcTemplate.update("delete from event where id = ?", id);
	}

	@Override
	public List<Map<String, Object>> getEventList() {
		return this.jdbcTemplate.queryForList("select * from event ");
	}
}
