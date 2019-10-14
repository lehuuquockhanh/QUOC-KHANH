
package javakt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class help{
	
	public static boolean isThisDateValid(String dateToValidate, String dateFromat){
		
		if(dateToValidate == null){
			return false;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);
		
		try {
		
			Date date = sdf.parse(dateToValidate);
		
		} catch (ParseException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }

	    return true;
	}
}