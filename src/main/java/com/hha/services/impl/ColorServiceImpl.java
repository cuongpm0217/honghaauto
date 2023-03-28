package com.hha.services.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.Color;
import com.hha.repository.ColorRepository;
import com.hha.services.ColorService;

@Service
public class ColorServiceImpl implements ColorService{
	@Autowired
	private ColorRepository repo;
	@Override
	public Color createColor(Color c) {
		c.setEnable(true);
		return repo.save(c);
	}

	@Override
	public Color updateColor(long id, Color c) {
		Color color = repo.findById(id).get();
		if(Objects.nonNull(color)||Objects.nonNull(c)) {
			color.setCode(c.getCode());
			color.setEnable(c.isEnable());
			color.setName(c.getName());
			color.setRgb(c.getRgb());
		}
		return repo.save(color);
	}

	@Override
	public void deleteColor(long id) {
		repo.deleteById(id);		
	}

	@Override
	public void hiddenColor(long id) {
		Color color = repo.findById(id).get();
		if(Objects.nonNull(color)||Objects.nonNull(id)) {
			color.setEnable(false);
			repo.save(color);
		}		
	}

	@Override
	public Color getColorById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Color> getAllColor() {
		return repo.findAll();
	}

}