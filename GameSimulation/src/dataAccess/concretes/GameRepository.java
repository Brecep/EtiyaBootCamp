package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BaseDataRepository;
import entities.abstracts.Entity;

public class GameRepository implements BaseDataRepository {
	List<Entity> entities = new ArrayList<>();

	@Override
	public void add(Entity entity) {
		entities.add(entity);
		System.out.println("Oyun eklendi!");
	}

	@Override
	public void delete(Entity entity) {
		entities.remove(entity);
		System.out.println("Oyun eklendi!");
	}

	@Override
	public void update(Entity entity) {
		System.out.println("Oyun Güncellendi");
	}

	@Override
	public List<Entity> getAll() {

		return entities;
	}

}
