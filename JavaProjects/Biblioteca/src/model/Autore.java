package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Autore 
{
	private String nome;
	private String cognome;
	private GregorianCalendar dataNascita;
	private GregorianCalendar dataMorte;
	private String luogoNascita;
	private String luogoMorte;
	private ArrayList<Libro> listaLibri;
	
	//COSTRUTTORI
	public Autore(){}
	
	public Autore(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
	}
	
    public Autore(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, ArrayList<Libro> listaLibri) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.listaLibri = listaLibri;
	}

    
    public Autore(String nome, String cognome, GregorianCalendar dataNascita, GregorianCalendar dataMorte, String luogoNascita, String luogoMorte) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.dataMorte = dataMorte;
		this.luogoNascita = luogoNascita;
		this.luogoMorte = luogoMorte;
	}
    
    public Autore(String nome, String cognome, GregorianCalendar dataNascita, GregorianCalendar dataMorte, String luogoNascita, String luogoMorte, ArrayList<Libro> listaLibri) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.dataMorte = dataMorte;
		this.luogoNascita = luogoNascita;
		this.luogoMorte = luogoMorte;
		this.listaLibri = listaLibri;
	}

    //ACCESSORS
	public String getNome() 
	{
		return nome;
	}


	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	public String getCognome() 
	{
		return cognome;
	}


	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}


	public GregorianCalendar getDataNascita() 
	{
		return dataNascita;
	}


	public void setDataNascita(GregorianCalendar dataNascita) 
	{
		this.dataNascita = dataNascita;
	}


	public GregorianCalendar getDataMorte() 
	{
		return dataMorte;
	}


	public void setDataMorte(GregorianCalendar dataMorte) 
	{
		this.dataMorte = dataMorte;
	}


	public String getLuogoNascita() 
	{
		return luogoNascita;
	}


	public void setLuogoNascita(String luogoNascita) 
	{
		this.luogoNascita = luogoNascita;
	}


	public String getLuogoMorte() 
	{
		return luogoMorte;
	}


	public void setLuogoMorte(String luogoMorte) 
	{
		this.luogoMorte = luogoMorte;
	}
	
	//METODI
	public boolean isAlive()
	{
	   return (this.dataMorte == null && this.luogoMorte == null);
	}


	@Override
	public String toString() 
	{
		String partiDelCognome[] = cognome.split(" ");
		
		for(int i = 0; i<partiDelCognome.length; i++)
		   partiDelCognome[i] =  ("" + partiDelCognome[i].charAt(0)).toUpperCase() + partiDelCognome[i].substring(1).toLowerCase(); 
		
		cognome = String.join(" ", partiDelCognome);
		
		return 	"Autore: " 
				+ (nome != null ?  ("" + nome.charAt(0)).toUpperCase() + ". ": "")
				+ (cognome != null ? cognome + "\n" : "")
				+ (dataNascita != null ? "Data di Nascita: " + dataNascita.get(Calendar.DAY_OF_MONTH) + "/" + (dataNascita.get(Calendar.MONTH)+1) + "/" + dataNascita.get(Calendar.YEAR) + "\n" : "")
				+ (
				   isAlive() ? 
					  "è Vivo" : 
					  "dataMorte: " + dataMorte.get(Calendar.DAY_OF_MONTH) + "/" + (dataMorte.get(Calendar.MONTH)+1) + "/" + dataMorte.get(Calendar.YEAR) + "\n"
					+ "Luogo di Morte: " + luogoMorte
				  )
				+ (listaLibri != null ?  "\n" + listaLibri : "")
				;
	}
	
	
    
    
	
	
	
	
}
