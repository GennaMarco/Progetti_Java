package fileoggetto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import enumeration.Sesso;

public class Persona implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	//ATTRIBUTI
	private String nome;
	private String cognome;
	private GregorianCalendar dataNascita;
	private String luogoNascita;
	private Sesso sesso;
	
	//COSTRUTTORI
	public Persona()
	{
		//logica di azzeramento
		this.dataNascita = new GregorianCalendar();
		this.sesso = Sesso.ALTRO;
	}
	
	public Persona(String nome, String cognome) 
	{
	   this();
	   this.nome = nome;
	   this.cognome = cognome;
	}
	
	public Persona(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita) 
	{
		this(nome, cognome);
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
	}
	
	public Persona(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sesso) 
	{
	   this(nome, cognome, dataNascita, luogoNascita);	
	   this.sesso = sesso;
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

	public String getLuogoNascita() 
	{
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) 
	{
		this.luogoNascita = luogoNascita;
	}
	
	public Sesso getSesso() 
	{
		return sesso;
	}

    public void setSesso(Sesso sesso) 
    {
		this.sesso = sesso;
	}

    //METODI
    public int eta()
	{
    	GregorianCalendar cal = new GregorianCalendar();
	
		int a_oggi = cal.get(GregorianCalendar.YEAR);
		int m_oggi = cal.get(GregorianCalendar.MONTH);
		int g_oggi = cal.get(GregorianCalendar.DAY_OF_MONTH);
		
		int eta = a_oggi - dataNascita.get(GregorianCalendar.YEAR);
		
		if(m_oggi<dataNascita.get(GregorianCalendar.MONTH) 
		  || (m_oggi==dataNascita.get(GregorianCalendar.MONTH) 
		  && g_oggi < dataNascita.get(GregorianCalendar.DAY_OF_MONTH)))
			 
			eta--;
		return eta;
	}

	@Override
	public String toString() 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  // classe che appartiene al package per la gestione delle stringhe, da la possibilità di scegliere il tipo di formato
	    //String data = sdf.format(dataNascita.getTime());          // serve per riportare il gregorian calendar al date
		String data = "";
		if(dataNascita!=null)
			data=sdf.format(dataNascita.getTime());
		
		return  ""
				+ (nome != null ? "nome: " + nome : "")
				+ (cognome != null ?"\ncognome: " + cognome : "") 
				+ (dataNascita != null ? "\ndata nascita: " + data : "") 
				+ (luogoNascita != null ?"\nluogo nascita: " + luogoNascita : "")
				+ (dataNascita != null ?"\netà: " + eta() : "")
				+ (sesso != null ?"\nsesso: " + sesso : "")
				;
	}
	
	

	
	
	
	
}
