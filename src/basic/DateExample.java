package basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
	public static void main(String[] args) {
		long s=System.currentTimeMillis();
		Date D= new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("E dd-MM-YYYY HH:MM:SS a zzz");
		long e=System.currentTimeMillis();
		System.out.print(dateFormat.format(D));
		System.out.print(e-s);
		
		GregorianCalendar G= new GregorianCalendar();
		G.get(Calendar.DATE);
		System.out.print(G.get(Calendar.DATE));
		G.set(2019, 10, 10);
	}

}
