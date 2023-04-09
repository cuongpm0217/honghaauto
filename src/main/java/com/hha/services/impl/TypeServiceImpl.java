package com.hha.services.impl;

import com.hha.entities.Type;
import com.hha.repository.TypeRepository;
import com.hha.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeRepository repo;

    @Override
    public Type create(Type type) {
        type.setEnable(true);
        return repo.save(type);
    }

    @Override
    public Type update(long id, Type type) {
        if (type != null || repo.findById(id).isPresent()) {
            Type tSelect = repo.findById(id).get();
            tSelect.setEnable(type.isEnable());
            tSelect.setGenId(type.getGenId());
            tSelect.setName(type.getName());
            return repo.save(tSelect);
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
            Type tSelect = repo.findById(id).get();
            tSelect.setEnable(false);
            repo.save(tSelect);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Type getById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Type> getAll() {
        return repo.findAll();
    }

}
