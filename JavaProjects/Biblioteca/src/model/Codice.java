package model;

public class Codice 
{
	private final String PREFISSOEAN = "978";
	private Editore editore;
	private String titolo;
	
	public Codice(Editore editore, String titolo) 
	{
		this.editore = editore;
		this.titolo = titolo;
	}

    @Override
	public String toString() 
	{
	   return PREFISSOEAN + editore.getNome().hashCode() + titolo.hashCode();
	}


	
	
	
	
	
	
}
