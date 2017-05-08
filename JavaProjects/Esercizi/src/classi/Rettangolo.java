package classi;

public class Rettangolo 
{
	// attributi
	private double base;
	private double altezza;
	
	//costruttore di default
	public Rettangolo()
	{
		this.base = 1;
		this.altezza = 1;
	}
	
	// costruttore con passaggio di parametri(overload)
	public Rettangolo(double base, double altezza)
	{
		setBase(base);
		setAltezza(altezza);
	}
	
	//accessor: setter
    public void setBase(double base)
	{
	   this.base = base;
	}
	
	public void setAltezza(double altezza)
	{
	   this.altezza = altezza;
	}
	
	//metodi
	public double perimetro()
	{
	   return (base+altezza)*2;
	}
	
	public double area()
	{
		return base*altezza;
	}
	
	public double diagonale()
	{
		return Math.sqrt((base*base)+(altezza*altezza));
	}
	
	public String stampa()
	{
		return stampa("\n");
	}
	
	public boolean IsCostruibile()
	{
		return base > 0 && altezza > 0;
	}
	
	public String stampa(String separatore)
	{
		if(!IsCostruibile())
			return "Dati inseriti non validi: base e altezza > 0";
					
		return "" 
	            + "Base: " + base
	            + separatore + "Altezza: " + altezza
				+ separatore + "Perimetro: " + perimetro() 
				+ separatore + "Area: " + area()
				+ separatore + "Diagonale: " + diagonale()
				;
	}
	
	@Override
	public String toString()
	{
		return stampa();
	}
}
