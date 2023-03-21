package com.hha.services;

import java.util.List;

import com.hha.entities.Color;

public interface ColorService {
	Color createColor(Color c);
	Color updateColor(long id,Color c);
	boolean deleteColor(long id);
	Color getColorById(long id);
	List<Color> getAllColor();
}
