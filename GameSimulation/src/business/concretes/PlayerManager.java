package business.concretes;

import java.util.List;

import business.abstracts.PlayerService;
import core.adapters.abstracts.MernisService;
import dataAccess.abstracts.BaseDataRepository;
import entities.abstracts.Entity;
import entities.concretes.Player;

public class PlayerManager implements PlayerService {

	private BaseDataRepository baseDataRepository;
	private MernisService mernisService;

	public PlayerManager(BaseDataRepository baseDataRepository, MernisService mernisService) {
		super();
		this.baseDataRepository = baseDataRepository;
		this.mernisService = mernisService;
	}

	@Override
	public void add(Player player) {
		checkIfRealPerson(player);
	}

	private void checkIfRealPerson(Player player) {
		if (mernisService.checkIfPerson(player)) {
			this.baseDataRepository.add(player);
		}
	}

	@Override
	public void delete(Player player) {
		this.baseDataRepository.delete(player);

	}

	@Override
	public void update(Player player) {
		this.baseDataRepository.update(player);

	}

	@Override
	public List<Entity> getAll() {

		return baseDataRepository.getAll();
	}

}