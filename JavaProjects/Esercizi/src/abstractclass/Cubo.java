package abstractclass;

public class Cubo extends Solido 
{
	private double lato;

	public Cubo(Materiale materiale, double lato) 
	{
	   super(materiale);
	   this.lato = lato;
	}
	
	@Override
	public double volume()
	{
	   return Math.pow(lato, 3);
	}
	
	public double superficeBase() 
	{
	   return lato*lato;
	}
	
	@Override
	public double superficeTotale() 
	{
	   return superficeBase()*6;
	}

	@Override
	public boolean isCostruibile() 
	{
	   return lato>0;	
	}
	
	@Override
	public String toString() 
	{
		if(!isCostruibile())
			  return "Dati Inseriti non validi ai fini della costruzione del Cubo";
		
		return "Cubo\n{\n" 
	           + "  lato = " + lato + " m"
	           + (super.toString() != null ? super.toString() + "\n" : "")
	           + "}\n"
			   ;
	}
}
