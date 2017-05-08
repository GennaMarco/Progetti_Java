package threading;

public class Countdown implements Runnable 
{
    private int conto;
   
    public Countdown(int conto)
    {
	   this.conto = conto;
	   Thread t = new Thread(this);
	   t.start();
    }
	
	@Override
	public void run() 
	{
		while(conto>=0)
		{
			System.out.println(conto--);
			try 
			{
			   Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
               e.printStackTrace();
		    }
			
		}
	}
}
