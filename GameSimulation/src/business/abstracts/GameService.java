package business.abstracts;

import java.util.List;

import entities.abstracts.Entity;
import entities.concretes.Game;

public interface GameService {
	void add(Game game);

	void delete(Game game);

	void update(Game game);

	List<Entity> getAll();
}