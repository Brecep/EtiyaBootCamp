package business.abstracts;

import java.util.List;

import entities.abstracts.Entity;
import entities.concretes.Player;

public interface PlayerService {
	void add(Player player);

	void delete(Player player);

	void update(Player player);

	List<Entity> getAll();
}
