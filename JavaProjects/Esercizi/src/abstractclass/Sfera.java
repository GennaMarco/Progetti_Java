package abstractclass;

public class Sfera extends Solido 
{
	private double raggio;
	
	public Sfera(Materiale materiale, double raggio) 
	{
	   super(materiale);
	   this.raggio = raggio;
	}
	
	public double getRaggio() 
	{
	   return raggio;
	}

    public void setRaggio(double raggio) 
	{
	   this.raggio = raggio;
	}

    @Override
	public double volume() 
    {
	   return 4.0/3*Math.PI*Math.pow(raggio, 3);
	}
    
    @Override
	public double superficeTotale() 
	{
	   return 4*Math.PI*raggio*raggio;
	}
    
    @Override
	public boolean isCostruibile() 
	{
	   return raggio>0;
	}
    
    @Override
  	public String toString() 
  	{
    	if(!isCostruibile())
  		  return "Dati Inseriti non validi ai fini della costruzione della sfera";
    	
  		return "Sfera\n{\n" 
  	            + "  raggio = " + raggio + " m"
  	            + (super.toString() != null ? super.toString() + "\n" : "")
  	            + "}\n"
  	           ;
  	}
}
