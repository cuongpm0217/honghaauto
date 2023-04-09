package com.hha.services;

import com.hha.entities.Module;

import java.util.List;

public interface ModuleService {
    Module create(Module m);

    Module update(long id, Module p);

    void delete(long id);

    boolean hidden(long id);

    Module getById(long id);

    Module getByName(String name);

    List<Module> getAll();
}
