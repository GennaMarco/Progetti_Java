package classi;

public class Cerchio 
{
	private double raggio;
	
	public Cerchio()
	{
		this.raggio = 1;
	}
	
	public Cerchio(double raggio)
	{
		setRaggio(raggio);
	}
	
	public double getRaggio()
	{
	   return raggio;
	}
	
	public void setRaggio(double raggio)
	{
	   if(raggio>0)
	   	  this.raggio = raggio;
	}
	
	public double circonferenza()
	{
		return 2*Math.PI*raggio;
	}
	
	public double area()
	{
	   return Math.PI * raggio * raggio;
	}
	
	public String stampa()
	{
		return "" 
	            + "Raggio: " + raggio
				+ "\nCirconferenza: " + circonferenza() 
				+ "\nArea: " + area()
				;
	}
}
