package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BaseDataRepository;
import entities.abstracts.Entity;

public class PlayerRepository implements BaseDataRepository {
	List<Entity> entities = new ArrayList<>();

	@Override
	public void add(Entity entity) {
		entities.add(entity);
		System.out.println("Oyuncu eklendi!");
	}

	@Override
	public void delete(Entity entity) {
		entities.remove(entity);
		System.out.println("Oyuncu silindi!");
	}

	@Override
	public void update(Entity entity) {
		System.out.println("Oyuncu güncellendi!");
	}

	@Override
	public List<Entity> getAll() {
		return entities;
	}

}
