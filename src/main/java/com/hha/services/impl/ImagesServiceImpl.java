package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.Images;
import com.hha.repository.ImagesRepository;
import com.hha.services.ImagesService;

@Service
public class ImagesServiceImpl implements ImagesService {
	@Autowired
	private ImagesRepository repo;

	@Override
	public Images create(Images image) {
		return repo.save(image);
	}

	@Override
	public Images update(long id, Images image) {
		Images imgSelect = repo.findById(id).get();
		if (imgSelect != null) {
			imgSelect.setDescription(image.getDescription());
			imgSelect.setEnable(image.isEnable());
			imgSelect.setTittle(image.getTittle());
			imgSelect.setUrl(image.getUrl());
			return repo.save(imgSelect);
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
		Images imgSelect = repo.findById(id).get();
		if (imgSelect != null) {
			imgSelect.setEnable(false);
			repo.save(imgSelect);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Images getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Images> getAll() {
		return repo.findAll();
	}

}
