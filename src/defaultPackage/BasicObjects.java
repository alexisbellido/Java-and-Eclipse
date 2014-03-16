package defaultPackage;

//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.Date;
import java.util.*;

public class BasicObjects {

	public static void main(String[] args) {
		// A Date knows about a point in time and doesn't care about familiar calendar notation.
		Date today = new Date();
		Date birthday = null;
		birthday = today;
		
		System.out.println("Today is: " + today);
		System.out.println("Birthday is: " + birthday);
		
		// A GregorianCalendar knows about days, names of months and other
		// calendar related details.
		// Months are counted from 0 to 11, so it's better to use constants like Calendar.DECEMBER
		GregorianCalendar deadline = new GregorianCalendar(2015, Calendar.DECEMBER, 31);
		System.out.println("Deadline month using Calendar.MONTH is: " + deadline.get(Calendar.MONTH));
		System.out.println("Deadline month name is: " + deadline.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US));
		
		// Change year to May
		deadline.set(Calendar.YEAR, 2018);
		System.out.println("Deadline year is: " + deadline.get(Calendar.YEAR));
		
		// Change year, month and day with just one call.
		deadline.set(2015, 4, 1);
		System.out.println("Deadline month name is: " + deadline.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US));
		System.out.println("Deadline year is: " + deadline.get(Calendar.YEAR));
	}

}
