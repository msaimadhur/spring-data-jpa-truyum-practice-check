package com.cognizant.truyum.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
public static Date convertToDate(String date)
	{
		try {
			return	new SimpleDateFormat("dd/MM/yyyy").parse(date);
			 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
}