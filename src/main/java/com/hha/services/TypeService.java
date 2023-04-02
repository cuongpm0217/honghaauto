package com.hha.services;

import java.util.List;
import com.hha.entities.Type;

public interface TypeService {
	Type create(Type type);

	Type update(long id, Type type);

	void delete(long id);

	boolean hidden(long id);

	Type getById(long id);

	List<Type> getAll();
}
