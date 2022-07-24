package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BaseDataRepository;
import entities.abstracts.Entity;

public class CampaignRepository implements BaseDataRepository {
	List<Entity> entities = new ArrayList<>();

	@Override
	public void add(Entity entity) {
		entities.add(entity);
		System.out.println("Kampanya Eklendi!");
	}

	@Override
	public void delete(Entity entity) {
		entities.remove(entity);
		System.out.println("Kampanya Silindi!");
	}

	@Override
	public void update(Entity entity) {
		System.out.println("Kampanya Güncellendi!");

	}

	@Override
	public List<Entity> getAll() {
		// TODO Auto-generated method stub
		return entities;
	}

}
