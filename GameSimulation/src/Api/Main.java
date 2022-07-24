package Api;

import business.abstracts.CampaignService;
import business.abstracts.GameService;
import business.abstracts.PlayerService;
import business.abstracts.SalesService;
import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.PlayerManager;
import business.concretes.SalesManager;
import core.adapters.concretes.MernisAdapter;
import dataAccess.concretes.CampaignRepository;
import dataAccess.concretes.GameRepository;
import dataAccess.concretes.PlayerRepository;
import dataAccess.concretes.Sale;
import entities.abstracts.Entity;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;

public class Main {

	public static void main(String[] args) {
		PlayerService playerService = new PlayerManager(new PlayerRepository(), new MernisAdapter());
		Player player = new Player(1, "Recep", "Bayindir", 1997, "1111111111");
		playerService.add(player);
		playerService.update(player);
		playerService.delete(player);

		GameService gameService = new GameManager(new GameRepository());
		Game game = new Game("Sims 4", 350, 4.5);
		gameService.add(game);

		CampaignService campaignService = new CampaignManager(new CampaignRepository());
		Campaign campaign = new Campaign(1, "Sezon indirimi", 0.25);
		campaignService.add(campaign);

		SalesService salesService = new SalesManager();
		salesService.sale(new Sale(1, player), player, campaign, game);
	}

}
