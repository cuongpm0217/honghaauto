package com.hha.services;

import java.util.List;

import com.hha.entities.Videos;


public interface VideosService {
	Videos create(Videos video);

	Videos update(long id, Videos video);

	void delete(long id);

	boolean hidden(long id);

	Videos getById(long id);

	List<Videos> getAll();
}
