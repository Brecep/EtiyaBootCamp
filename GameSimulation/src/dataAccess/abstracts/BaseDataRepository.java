package dataAccess.abstracts;

import java.util.List;

import entities.abstracts.Entity;

public interface BaseDataRepository {
	void add(Entity entity);

	void delete(Entity entity);

	void update(Entity entity);

	List<Entity> getAll();
}
