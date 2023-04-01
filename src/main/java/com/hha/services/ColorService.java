package com.hha.services;

import com.hha.entities.Color;

import java.util.List;

public interface ColorService {
	Color createColor(Color c);
	Color updateColor(long id,Color c);
	void deleteColor(long id);
	void hiddenColor(long id);
	Color getColorById(long id);
	List<Color> getAllColor();
}
