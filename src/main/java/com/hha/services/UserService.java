package com.hha.services;

import java.util.List;

import com.hha.entities.User;

public interface UserService {
	User create(User user);

	User update(long id, User user);

    void delete(long id);

    boolean hidden(long id);

    User getById(long id);

    List<User> getAll();
}
