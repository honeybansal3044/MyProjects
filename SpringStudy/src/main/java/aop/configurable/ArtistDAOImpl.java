package aop.configurable;

import org.springframework.stereotype.Component;

@Component
public class ArtistDAOImpl implements ArtistDAO {

	@Override
	public void save(Artist artist) {
		System.out.println("Saving artist " + artist.getName());
	}

}
