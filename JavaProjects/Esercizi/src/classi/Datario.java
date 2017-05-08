package classi;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datario {

	public static void main(String[] args) 
	{
	   // gestione di una data
	   Date d = new Date();	
       System.out.println(d);
       
       String oggi =d.getDay() + "/" + d.getMonth() + "/" + d.getYear();
       System.out.println(oggi);
       
       GregorianCalendar cal = new GregorianCalendar();
       System.out.println(cal);
       
       oggi = cal.get(Calendar.DAY_OF_MONTH) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR);
       System.out.println(oggi);
       
      
       String ora = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
       System.out.println(ora);
       
       
       GregorianCalendar data1 = new GregorianCalendar(1997, 11, 6);
       data1.setLenient(false);
       String dataNascita = data1.get(Calendar.YEAR) + "/" + (data1.get(Calendar.MONTH) + 1) + "/" + data1.get(Calendar.DAY_OF_MONTH);
       System.out.println(dataNascita);
       
       
	}

}
