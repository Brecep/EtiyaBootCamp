package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import dataAccess.abstracts.BaseDataRepository;
import entities.abstracts.Entity;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	private BaseDataRepository baseDataRepository;

	public CampaignManager(BaseDataRepository baseDataRepository) {
		super();
		this.baseDataRepository = baseDataRepository;
	}

	@Override
	public void add(Campaign campaign) {
		this.baseDataRepository.add(campaign);

	}

	@Override
	public void delete(Campaign campaign) {
		this.baseDataRepository.delete(campaign);

	}

	@Override
	public void update(Campaign campaign) {
		this.baseDataRepository.update(campaign);
	}

	@Override
	public List<Entity> getAll() {
		return this.baseDataRepository.getAll();
	}

}
