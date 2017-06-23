package aop.configurable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

@Configurable
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Artist {

	private ArtistDAO artistDao;
	
	public ArtistDAO getArtistDao() {
		return artistDao;
	}
	
	@Autowired
	public void setArtistDao(ArtistDAO artistDao) {
		this.artistDao = artistDao;
	}

	public void save() {
        artistDao.save(this);
    }
	
	public String getName() {
		return "Honey";
	}
	
}
