package business.abstracts;

import java.util.List;

import entities.abstracts.Entity;
import entities.concretes.Campaign;

public interface CampaignService {
	void add(Campaign campaign);

	void delete(Campaign campaign);

	void update(Campaign campaign);

	List<Entity> getAll();
}
