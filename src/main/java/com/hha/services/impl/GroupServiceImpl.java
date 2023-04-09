package com.hha.services.impl;

import com.hha.entities.Group;
import com.hha.repository.GroupRepository;
import com.hha.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository repo;

    @Override
    public Group create(Group group) {
        group.setEnable(true);
        return repo.save(group);
    }

    @Override
    public Group update(long id, Group group) {
        if (group != null || repo.findById(id).isPresent()) {
            Group gSelect = repo.findById(id).get();
            gSelect.setEnable(group.isEnable());
            gSelect.setGenId(group.getGenId());
            gSelect.setName(group.getName());
            return repo.save(gSelect);
        } else {
            return null;
        }

    }

    @Override
    public void delete(long id) {
        repo.deleteById(id);

    }

    @Override
    public boolean hidden(long id) {
        if (repo.findById(id).isPresent()) {
            Group gSelect = repo.findById(id).get();
            gSelect.setEnable(false);
            repo.save(gSelect);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Group getById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Group> getAll() {
        return repo.findAll();
    }

}
