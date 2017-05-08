package ereditarieta;

import java.util.GregorianCalendar;

public class TestPersone {

	public static void main(String[] args) 
	{
		GregorianCalendar pinoDataNascita = new GregorianCalendar(1963,0,26);
		//pinoDataNascita.setLenient(false);
		
		Persona pino = new Persona("Pino","Caluso",pinoDataNascita,"Caluso");
		System.out.println(pino);
		
		Studente lino = new Studente("Lino","Caluso");
		lino.setCorso("VideoScrittura Grafica Compentente");
		System.out.println("\n"+lino);
		
		Docente mino = new Docente("Mino","Caluso");
		mino.setCorso("VideoScrittura Grafica Compentente");
		mino.setMateria("Grafologia");
		System.out.println("\n"+ mino);
		
		Persona rino = mino;
		rino.setNome("Rino");
		System.out.println("\n"+rino);
	    System.out.println("\n"+mino);
	    
	    Persona[] persone = new Persona[5];
		persone[0]=pino;
		persone[1]=lino;
		persone[2]=mino;
		persone[3]=rino;
		persone[4]=new Persona("Gino","Deluso");
		
		System.out.println("\n\nElenco persone");
		for(int i=0;i<persone.length;i++)
		{
		   Studente s = null;
		   if(persone[i] instanceof Studente)
		   {
			  s = (Studente)persone[i];
			  System.out.println(s.getCorso());
		   }
		}
	}
}
