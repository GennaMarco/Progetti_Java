package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Libro 
{
   private String titolo;
   private Autore autore;
   private Editore editore;
   private int numPagine;
   private GregorianCalendar annoPubblicazione;
   private Codice codisbn;
   private Posizione posizione;
   
   //COSTRUTTORI
   public Libro(){}

   public Libro(String titolo, Autore autore, Editore editore, int numPagine, GregorianCalendar annoPubblicazione) 
   {
	  this.titolo = titolo;
	  this.autore = autore;
	  this.editore = editore;
	  this.numPagine = numPagine;
	  this.annoPubblicazione = annoPubblicazione;
	  Codice codice = new Codice(this.editore, this.titolo);
	  this.codisbn = codice;
   }
    
    //ACCESSORS
	public String getTitolo() 
	{
		return titolo;
	}
	
	public void setTitolo(String titolo) 
	{
		this.titolo = titolo;
	}
	
	public Autore getAutore() 
	{
		return autore;
	}
	
	public void setAutore(Autore autori) 
	{
		this.autore = autori;
	}
	
	public Editore getEditore() 
	{
		return editore;
	}
	
	public void setEditore(Editore editore) 
	{
		this.editore = editore;
	}
	
	public int getNumPagine() 
	{
		return numPagine;
	}
	
	public void setNumPagine(int numPagine) 
	{
		this.numPagine = numPagine;
	}
	
	public GregorianCalendar getAnnoPubblicazione() 
	{
		return annoPubblicazione;
	}
	
	public void setAnnoPubblicazione(GregorianCalendar annoPubblicazione) 
	{
		this.annoPubblicazione = annoPubblicazione;
	}
	
	public Posizione getPosizione() 
	{
	   return posizione;
	}
		
	public void setPosizione(Posizione posizione) 
	{
	   this.posizione = posizione;
	}
   
	//METODI
	public double CalcolaCostoLibro()
	{
	   final double costoStampa = 7.50;
	   final double costoPerPagina = 0.05;
	   
	   return (costoStampa + (costoPerPagina*numPagine));	   
	}

	@Override
	public String toString() 
	{
		
		return "Libro\n[\n"
		        + (titolo != null ? "titolo: " + titolo + "\n" : "")
				+ (autore != null ?  autore + "\n" : "")
				+ (editore != null ? editore + "\n" : "") 
				+ "numPagine: " + numPagine + "\n"
				+ (annoPubblicazione != null ? "Anno di Pubblicazione: " + annoPubblicazione.get(Calendar.YEAR) + "\n" : "")
				+ "Costo libro: €" + CalcolaCostoLibro() + "\n"
				+ "Codice ISBN = " + codisbn +"\n"
				+ posizione + "\n]\n"
				;
	}   
   

}
