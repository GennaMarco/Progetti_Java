package threading;

public class TestCountdown 
{

	public static void main(String[] args) 
	{
	   int conto1= 10;
	   int conto2 = 4;
	   
	   Countdown cd = new Countdown(conto1);
	   
	   try 
	   {
		  Thread.sleep((conto1*1000) - (conto2*1000));
	   } 
	   catch (InterruptedException e) 
	   {
		  e.printStackTrace();
	   }
	   Countdown cd2 = new Countdown(conto2);
	   
	   
	   
	}

}
