package programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Date;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

import javax.security.auth.callback.LanguageCallback;

public class CurrencyDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale loca=Locale.US;
		Currency cur=Currency.getInstance(loca);
				System.out.println(cur.getCurrencyCode()+" "+cur.getSymbol(loca)+ cur.getDisplayName());
		SimpleDateFormat date1=new SimpleDateFormat("MM dd",Locale.ENGLISH);
		SimpleDateFormat date2=new SimpleDateFormat("MMMM-EEEE");
		String actual="March-Friday";
		Date d=date2.parse(actual);
		System.out.println(date1.format(d).toString());
		
		String actualDate = "2016-03-20";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM yyyy", Locale.ENGLISH);
		LocalDate ld = LocalDate.parse(actualDate, dtf);
		String month_name = dtf2.format(ld);
		System.out.println(month_name);
		
		Locale locale2=new Locale(Locale.ENGLISH.toString(), Locale.US.toString());
		System.out.println(locale2.getLanguage()+" "+locale2.getDisplayLanguage()+" "+locale2.getCountry());
		
		 Dictionary d10 = new Hashtable();

	      // add 2 elements
	      d10.put(1, "Cocoa");
	      d10.put(4, "Chocolate" + "Bar");
	      System.out.println("\"1\" is " + d10.get(1));
	      System.out.println("\"4\" is " + d10.get(4));

	      // generates a series of elements, one at a time
	      for (Enumeration e = d10.elements(); e.hasMoreElements();) {
	         System.out.println(e.nextElement());
	      }

	}

}
