package jdbc;

import java.util.List;
import java.util.Map;

public interface CorporateEventDao {

	public void createTable();
	
	public void insertEvent(int id, String name);
	
	public void updateEvent(int id, String name);
	
	public void deleteEvent(int id);
	
	public List<Map<String, Object>> getEventList();
}
