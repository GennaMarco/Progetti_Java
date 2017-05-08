package threading;

import java.io.IOException;
import java.util.GregorianCalendar;

public class TestDatario 
{

	public static void main(String[] args) 
	{
		int riposo = 1000;

		/*Datario orologio = new Datario(riposo);
		try 
		{
			Thread.sleep(riposo);
		} 
		catch (InterruptedException e) 
		{
		   e.printStackTrace();
		}*/
		DatarioMetodoProf orologio = new DatarioMetodoProf();
		
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
