package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.CapoOfficina;
import model.Meccanico;
import model.Ordine;
import model.ProdottoScelto;
import model.ResponsabileVenditori;
import model.Venditore;

public class Test {

	public static void main(String[] args) 
	{
		int scelta;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		Venditore v1 = new Venditore("Mauro", "Amico", 1400, "auto");
		Venditore v2 = new Venditore("Cauro", "Emico", 1600, "moto");
		
		ArrayList<Venditore> venditori = new ArrayList<Venditore>();
		venditori.add(v1);
		venditori.add(v2);
		
		Meccanico m1 = new Meccanico("Pauro", "Tmico", 1100, "carrozzeria");
		Meccanico m2 = new Meccanico("Hauro", "Umico", 1200, "meccanica");
		
		ArrayList<Meccanico> meccanici = new ArrayList<Meccanico>();
		meccanici.add(m1);
		meccanici.add(m2);
		
		ProdottoScelto p1 = new ProdottoScelto(1, "Moto", "Ninja", 4500.55, 2);
		ProdottoScelto p2 = new ProdottoScelto(2, "Auto", "BMW", 15678, 3);
		
		
		ArrayList<ProdottoScelto> prodotti = new ArrayList<ProdottoScelto>();
		
		prodotti.add(p1);
		prodotti.add(p2);
		
		
		GregorianCalendar dataOrd1 = new GregorianCalendar(1996, 7, 2, 14, 5, 7);
		GregorianCalendar dataOrd2 = new GregorianCalendar(2004, 5, 3, 9, 5, 58);
		
		ArrayList<Ordine> ordini = new ArrayList<Ordine>();
		
		Ordine o1 = new Ordine(1, dataOrd1, prodotti, v1);
		Ordine o2 = new Ordine(2, dataOrd2, prodotti, v2);
		
		ordini.add(o1);
		ordini.add(o2);
		
		ResponsabileVenditori r1 = new ResponsabileVenditori("Carlo", "Cracco", 1700, "auto", venditori);
		CapoOfficina c1 = new CapoOfficina("Parlo", "Jracco", 2000, "carrozzeria", ordini);
		
		
		do{
			System.out.println("\nMENU");
			System.out.println("0 --> Chiudi il programma");
	        System.out.println("1 --> Stampa elenco venditori");
	        System.out.println("2 --> Stampa elenco meccanici");
	        System.out.println("3 --> Stampa Ordine");
	        System.out.println("4 --> Stampa dati del responsabile venditore");
	        System.out.println("5 --> Stampa dati del capo officina");
	        
	        System.out.print("Inserisci comando: ");
	
		    try
		    {
		       scelta = Integer.parseInt(tastiera.readLine());
		    }
		    catch(Exception e)
		    {
		    	scelta = -1;
		    }
		    
		    switch(scelta)
		    {
		       case 1:
		    	      System.out.println("Elenco venditori"); 
		    	      for(int i = 0; i<venditori.size(); i++)
		    	          System.out.println(venditori.get(i));
		    	      break;
		    	      
		       case 2:
		    	      System.out.println("Elenco meccanici"); 
	    	          for(int i = 0; i<meccanici.size(); i++)
	    	             System.out.println(meccanici.get(i));
	    	          break;
	    	          
		       case 3:
		    	      System.out.println(o2); 
 	                  break;
 	                  
		       case 4:
		    	      System.out.println(r1);
		              break;
		              
		       case 5: 
		              System.out.println(c1);
		              break; 
		    	     
		       case 0:
		    	      System.out.println("Programma terminato");
                      break;
                       
		       default:
		    	      System.out.println("Inserisci comando valido");        
		    	     
		    }
		    
	    }while(scelta != 0);
	}

}
