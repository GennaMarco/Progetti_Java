package classi;

public class Quadrato 
{
	// dichiarazioni degli attributi (di solito privati)
	private double lato;
	
	
	
	// costruttore di default
	public Quadrato()
	{
		this.lato = 1;
	}
	
	// costruttore con passagio di parametri (overlading)
	public Quadrato(double lato)
	{
		setLato(lato);
		//this.lato = lato;   // this è un puntatore interno della classe, in questo caso punta il private double lato
	}
	
	
	// accessor: permettono di leggere e scrivere su un attributo all'interno di una classe (get e set) get = leggi; set = scrivi
	// getter
	public double getLato()
	{
	   return lato;
	}
	
	// setter
	public void setLato(double lato)
	{
	   if(lato>0)
	   	  this.lato = lato;
	}
	
	
	// metodi
	public double perimetro()
	{
		return lato*4;
	}
	
	public double area()
	{
	   return lato*lato;
	}
	
	public double diagonale()
	{
		return lato * Math.sqrt(2);  //sqrt è la radice quadrata
	}
	
	public String stampa()
	{
		return "" 
	            + "Lato: " + lato
				+ "\nPerimetro: " + perimetro() 
				+ "\nArea: " + area()
				+ "\nDiagonale: " + diagonale()
				;
	}
	
	

}
