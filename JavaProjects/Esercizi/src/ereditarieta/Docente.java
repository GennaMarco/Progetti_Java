package ereditarieta;

import java.util.GregorianCalendar;

import enumeration.Sesso;

public class Docente extends Studente 
{
	private String materia;

	public Docente() 
	{
	   super();		
	}

	public Docente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sesso, String corso) 
	{
	   super(nome, cognome, dataNascita, luogoNascita, sesso, corso);
	}

	public Docente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita) 
	{
	   super(nome, cognome, dataNascita, luogoNascita);
	}

	public Docente(String nome, String cognome) 
	{
	   super(nome, cognome);
	}

	public String getMateria() 
	{
	   return materia;
	}

	public void setMateria(String materia) 
	{
	   this.materia = materia;
	}

	@Override
	public String toString() {
		return ""
				+ (super.toString() != null ? super.toString() + ", " : "")
				+ (materia != null ? "materia=" + materia : "")
				;
	}

	

	
	
}
