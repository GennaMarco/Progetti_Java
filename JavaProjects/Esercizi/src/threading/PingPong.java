package threading;

public class PingPong extends Thread  // classe thread ha un metodo run()
{
	private String frase;
	private int riposo;
	
	public PingPong(String frase, int riposo) 
	{
		this.frase = frase;
		this.riposo = riposo;
		start(); // metodo ereditato da thread per far
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
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
		// metodo che mantiene in vita l'oggetto
		
		while(true)
		{
			System.out.println(frase);
			try 
			{
			   sleep(riposo);  // metodo statico: si può richiamare senza avere istanze della classe thread, riposo in millisecondi
			} 
			catch (InterruptedException e) 
			{
			   e.printStackTrace();
			} 
		}
	}
	
}
