package ereditarieta;

import java.util.GregorianCalendar;

import enumeration.Sesso;

public class TestPersone2 {

	public static void main(String[] args) 
	{
	   Persona p1 = new Persona();
	   p1.setNome("pino");
	   p1.setCognome("gennarello");
	   p1.setDataNascita(new GregorianCalendar(1991, 5, 25));
	   System.out.println(p1);
	   
	   Studente s1 = new Studente();
	   s1.setNome("Rino");
	   s1.setCognome("Delino");
	   s1.setDataNascita(new GregorianCalendar(1991, 4, 25));
	   s1.setLuogoNascita("Torino");
	   s1.setSesso(Sesso.MASCHIO);
	   s1.setCorso("Informatica");
	   System.out.println(s1);
	   
	   Docente d1 = new Docente("paolo", "costante", new GregorianCalendar(1991, 3, 25), "Torino");
	   d1.setNome("lino");
	   d1.setMateria("Java");
	   System.out.println(d1);
	  

	}
	

}
