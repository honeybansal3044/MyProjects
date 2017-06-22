package aop.configurable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable(preConstruction=true)
public class Artist {

	@Autowired
	private ArtistDAO artistDao;
	
	public void save() {
        artistDao.save(this);
    }
	
	public String getName() {
		return "Honey";
	}
	
}
