package com.hha.services.impl;

import com.hha.entities.Combination;
import com.hha.repository.CombinationRepository;
import com.hha.services.CombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombinationServiceImpl implements CombinationService {
    @Autowired
    private CombinationRepository repo;

    @Override
    public Combination create(Combination combination) {
        combination.setEnable(true);
        return repo.save(combination);
    }

    @Override
    public Combination update(long id, Combination combination) {
        if (combination != null || repo.findById(id).isPresent()) {
            Combination gSelect = repo.findById(id).get();
            gSelect.setEnable(combination.isEnable());
            gSelect.setGenId(combination.getGenId());
            gSelect.setName(combination.getName());
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
            Combination gSelect = repo.findById(id).get();
            gSelect.setEnable(false);
            repo.save(gSelect);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Combination getById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Combination> getAll() {
        return repo.findAll();
    }

}
