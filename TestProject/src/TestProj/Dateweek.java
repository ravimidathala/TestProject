package TestProj;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateweek {
	
	public static String getWeekOfMonth(String date) {
		 String startDateString = date;

         // This object can interpret strings representing dates in the format MM/dd/yyyy
         DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 

         // Convert from String to Date
 
			Date startDate = null;
			try {
				startDate = df.parse(startDateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Calendar now = Calendar.getInstance();
		now.setTime(startDate);
	    
	    return Integer.toString(now.get(Calendar.WEEK_OF_MONTH));
	   
	  }
}
