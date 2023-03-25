package com.hha.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Converter {
	public String txtddMMyyyy(Date dateInput) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String result = "";
		if(dateInput !=null||Objects.nonNull(dateInput)) {
			result = df.format(dateInput);
		}
		return result;
	}

	public Date dateDMY(Date dateInput) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date result = df.parse("01/01/1900 00:00");
		if(dateInput!=null||Objects.nonNull(dateInput)) {
			String formatDate = df.format(dateInput);
			result = df.parse(formatDate);
		}
		return result;
	}
	public String txtDMYHH(Date dateInput) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String result = "";
		if(dateInput !=null||Objects.nonNull(dateInput)) {
			result = df.format(dateInput);
		}
		return result;
	}
	
	public Date dateDMYHH(Date dateInput) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date result = df.parse("01/01/1900 00:00");
		if(dateInput!=null||Objects.nonNull(dateInput)) {
			String formatDate = df.format(dateInput);
			result = df.parse(formatDate);
		}
		System.out.println("Results: "+result);
		return result;
	}
}
