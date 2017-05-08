package threading;

public class PingPong2 implements Runnable  // il'interfaccia 
{
	private String frase;
	private int riposo;
	
	public PingPong2(String frase, int riposo) 
	{
		this.frase = frase;
		this.riposo = riposo;
		Thread t = new Thread(this);  // crea il thread su questo oggetto!
		t.start();
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
		while(true)
		{
			System.out.println(frase);
			try 
			{
			   Thread.sleep(riposo);  // metodo statico: si può richiamare senza avere istanze della classe thread, riposo in millisecondi
			} 
			catch (InterruptedException e) 
			{
			   e.printStackTrace();
			} 
		}
	}
	
}

