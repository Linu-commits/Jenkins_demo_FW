package com.obsqura.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtility {

	public static String GetCurrentDate() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   return dtf.format(now);  
	}
}
