package business.concretes;

import java.util.List;

import business.abstracts.GameService;
import dataAccess.abstracts.BaseDataRepository;
import entities.abstracts.Entity;
import entities.concretes.Game;

public class GameManager implements GameService {

	private BaseDataRepository baseDataRepository;

	public GameManager(BaseDataRepository baseDataRepository) {
		super();
		this.baseDataRepository = baseDataRepository;
	}

	@Override
	public void add(Game game) {
		try {
			checkIfExistsName(game);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.baseDataRepository.add(game);
	}

	@Override
	public void delete(Game game) {
		this.baseDataRepository.delete(game);

	}

	@Override
	public void update(Game game) {
		this.baseDataRepository.update(game);
	}

	@Override
	public List<Entity> getAll() {

		return this.baseDataRepository.getAll();
	}

	private void checkIfExistsName(Game nameGame) throws Exception {
		// boolean isEmpty = true;
		if (nameGame.getName() != null) {
			return;
		} else if (nameGame.getName() == null) {
			throw new Exception("Alan bos gecilemez!");
		}
		// return isEmpty;
	}
}
