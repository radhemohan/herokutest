package com.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Utils {
	
	 private static final ThreadLocal<SimpleDateFormat> DATE_FORMATTER = new ThreadLocal<SimpleDateFormat>(){
	        @Override
	        protected SimpleDateFormat initialValue()
	        {
	            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
	        }
	    };
	public static String getCurrentTime(){
		TimeZone tz = TimeZone.getTimeZone("UTC");
		// I am adding formatter into threadlocal to avoid threading issue and memory 
		DateFormat df = DATE_FORMATTER.get(); 
		df.setTimeZone(tz);
		String nowAsISO = df.format(new Date());
		return nowAsISO;
	}

}
