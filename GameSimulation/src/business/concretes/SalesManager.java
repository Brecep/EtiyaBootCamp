package business.concretes;

import java.util.List;

import business.abstracts.SalesService;
import dataAccess.concretes.Sale;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;

public class SalesManager implements SalesService {

	public void sale(Sale sale, Player player, Campaign campaign, Game game) {
		System.out.println(sale.getId() + " " + campaign.getName() + " " + player.getFirstName() + " "
				+ saleCampaign(campaign, game) + " tutarından indirim uygulandı");
	}

	public double saleCampaign(Campaign campaign, Game game) {
		return campaign.getDiscountRate() * game.getPrice();
	}

	@Override
	public void add(Sale sale) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Sale sale) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Sale sale) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Sale> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
