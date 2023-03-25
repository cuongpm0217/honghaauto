package com.hha.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {
	public String convertddMMyyyy(Date dateInput) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(dateInput);
	}
	public Date date2ddMMyyyy(Date input) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String formatDate = df.format(input);
		return df.parse(formatDate);
	}
}
