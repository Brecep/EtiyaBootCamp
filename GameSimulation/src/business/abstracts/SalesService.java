package business.abstracts;

import java.util.List;

import dataAccess.concretes.Sale;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;

public interface SalesService {
	void add(Sale sale);

	void delete(Sale sale);

	void update(Sale sale);

	List<Sale> getAll();

	void sale(Sale sale, Player player, Campaign campaign, Game game);
}
