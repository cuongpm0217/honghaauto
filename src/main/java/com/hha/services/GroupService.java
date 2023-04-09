package com.hha.services;

import com.hha.entities.Group;

import java.util.List;

public interface GroupService {
    Group create(Group group);

    Group update(long id, Group group);

    void delete(long id);

    boolean hidden(long id);

    Group getById(long id);

    List<Group> getAll();
}
