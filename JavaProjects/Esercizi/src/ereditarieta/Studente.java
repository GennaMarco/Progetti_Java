package ereditarieta;

import java.util.GregorianCalendar;

import enumeration.Sesso;

public class Studente extends Persona 
{
	private String corso;

	public Studente()
	{
		super();
	}

	public Studente(String nome, String cognome) 
	{
	   super(nome, cognome);
	}

	public Studente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita) 
	{
       super(nome, cognome, dataNascita, luogoNascita);
	}

    public Studente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sesso, String corso) 
    {
	   super(nome, cognome, dataNascita, luogoNascita, sesso);
	   this.corso = corso;
	}

	public String getCorso() 
	{
	   return corso;
	}

	public void setCorso(String corso) 
	{
	   this.corso = corso;
	}

	@Override
	public String toString() 
	{
		return ""
				+ (super.toString() != null ? super.toString() + "\n" : "")
				+ (corso != null ? "corso: " + corso : "")
				;
	}
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
