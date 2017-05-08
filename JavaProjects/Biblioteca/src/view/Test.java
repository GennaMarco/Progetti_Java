package view;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.Autore;
import model.Editore;
import model.Indirizzo;
import model.Libro;
import model.Posizione;
import model.Provincia;
import model.Tipo;


public class Test {
	
	public static void CaricaLibro(ArrayList<Libro> listaLibri, Libro libro, Posizione posizione)
	{
		if(posizione.getScaffale()<3)
		{
		   posizione.setScaffale(posizione.getScaffale()+1);
		   Posizione p = new Posizione(1, posizione.getStanza(), posizione.getArmadio(), posizione.getScaffale());
		   libro.setPosizione(p);
	       listaLibri.add(libro);
		}
		else if(posizione.getArmadio()<3)
		{
			posizione.setScaffale(1);
			posizione.setArmadio(posizione.getArmadio()+1);
			Posizione p = new Posizione(1, posizione.getStanza(), posizione.getArmadio(), posizione.getScaffale());
			libro.setPosizione(p);
			listaLibri.add(libro);
		}
		else if(posizione.getStanza()<3)
		{
			posizione.setArmadio(1);
			posizione.setScaffale(1);
			posizione.setStanza(posizione.getStanza()+1);
			Posizione p = new Posizione(1, posizione.getStanza(), posizione.getArmadio(), posizione.getScaffale());
			libro.setPosizione(p);
			listaLibri.add(libro);
		}
			
		
	}

	public static void main(String[] args) 
	{
		GregorianCalendar dataNascita = new GregorianCalendar(1996,7, 2);
		GregorianCalendar dataMorte = new GregorianCalendar(2004, 5, 3);
		GregorianCalendar dataPubblicazione = new GregorianCalendar(2000, 5, 3);
		
		Autore autore1 = new Autore("maRco", "dE geNnaro", dataNascita, dataMorte, "Rivoli", "Napoli");
		Autore autore2 = new Autore("lorenzo", "scarpa", dataNascita, "Palermo");
		
		Indirizzo indirizzo1 = new Indirizzo(Tipo.VIA, "sestriere", "67", 10098, Provincia.NA);
		Indirizzo indirizzo2 = new Indirizzo(Tipo.PIAZZA, "mestieri", "15", 10098, Provincia.TO);
		
	    Editore editore1 = new Editore("Zanichelli", "S.P.A", indirizzo1, "011-7856642", "www.genna.com", "marcodege97@gmail.com");
	    Editore editore2 = new Editore("Amauri", "S.R.L", indirizzo2, "011-9574820", "www.lorenzo.com", "lorenzo94@gmail.com");
		
		Libro libro1 = new Libro("Harry potter", autore1, editore1, 500, dataPubblicazione);
	    Libro libro2 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro3 = new Libro("Harry potter", autore1, editore1, 500, dataPubblicazione);
	    Libro libro4 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro5 = new Libro("Harry potter", autore1, editore1, 500, dataPubblicazione);
	    Libro libro6 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro7 = new Libro("Harry potter", autore1, editore1, 500, dataPubblicazione);
	    Libro libro8 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro9 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro10 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro11 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro12 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro13 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    Libro libro14 = new Libro("La casa", autore2, editore2, 760, dataPubblicazione);
	    
	    int cor = 1;
	    int st = 1; 
	    int arm = 1;
	    int scaf = 0;
	    
	    ArrayList<Libro> listaLibri = new ArrayList();
	    Posizione posizione = new Posizione(cor, st, arm, scaf);
		
        CaricaLibro(listaLibri, libro1, posizione);
        CaricaLibro(listaLibri, libro2, posizione);
        CaricaLibro(listaLibri, libro3, posizione);
        CaricaLibro(listaLibri, libro4, posizione);
        CaricaLibro(listaLibri, libro5, posizione);
        CaricaLibro(listaLibri, libro6, posizione);
        CaricaLibro(listaLibri, libro7, posizione);
        CaricaLibro(listaLibri, libro8, posizione);
        CaricaLibro(listaLibri, libro9, posizione);
        CaricaLibro(listaLibri, libro10, posizione);
        CaricaLibro(listaLibri, libro11, posizione);
        CaricaLibro(listaLibri, libro12, posizione);
        CaricaLibro(listaLibri, libro13, posizione);
        CaricaLibro(listaLibri, libro14, posizione);
        
		
		for(int i = 0; i<listaLibri.size(); i++)
	       System.out.println(listaLibri.get(i));
		
		
	}

}
