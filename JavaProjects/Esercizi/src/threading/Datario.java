package threading;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 implementare orologio
 classe datario che stampa(giovedi 20 aprile 2017 ore(ora minuti secondi))
 stampato ogni secondo, ogni secondo avanzamento del time

*/
public class Datario implements Runnable
{
   private int riposo;

   public Datario(int riposo) 
   {
	  this.riposo = riposo;
	  Thread t = new Thread(this);
	  t.start();
   }

    public int getRiposo() {
	return riposo;
	}
	
	public void setRiposo(int riposo) {
		this.riposo = riposo;
	}

	@Override
	public void run() 
	{
	   while(true)
	   {
		  GregorianCalendar data = new GregorianCalendar(); 
		  System.out.println(data.get(Calendar.DAY_OF_MONTH) + "/" + (data.get(Calendar.MONTH)+1) + "/" + data.get(Calendar.YEAR));
		  System.out.println(data.get(Calendar.HOUR_OF_DAY) + ":" + data.get(Calendar.MINUTE) + ":" + data.get(Calendar.SECOND));
		  try 
		  {
			Thread.sleep(riposo);
		  } 
		  catch (InterruptedException e) 
		  {
	         e.printStackTrace();
		  }
	   }
	   
	}
   
   
   
   
   

}
