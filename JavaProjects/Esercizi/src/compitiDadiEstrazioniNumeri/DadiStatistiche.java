package compitiDadiEstrazioniNumeri;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DadiStatistiche 
{

	public static void main(String[] args) 
	{
	    int dado, i, scelta;
	    int faccie[] = new int[6];
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
        do{
        	 System.out.println();
	         System.out.println("MENU");
	    	 System.out.println("Premi 1 per lanciare il dado");
	    	 System.out.println("Premi 2 stampare le statistiche dei lanci");
	    	 System.out.println("Premi 0 per chiudere il programma");
	         System.out.print("Inserisci comando e premi INVIO: ");
		     try
		     {
		    		
		        scelta = Integer.parseInt(tastiera.readLine());
		     }
		     catch(Exception e)
		     {
		    	 scelta = 3;
		     }
		
		     switch(scelta)
		     {
			    case 1:
				  dado = MyLibrary.lancioDado();
				  i = dado-1;
				  faccie[i] = faccie[i] + 1;
				  System.out.println("Valore estratto: " + dado);
				  break;
				
			    case 2:
			       System.out.println("Elenco statistiche");
				   for(i = 0; i<6; i++)
				   {
				      System.out.println("Numero " + (i+1) + " uscito: " + faccie[i] + " volte");
				   }
				   break;
				  
			    case 0:
			    	System.out.println("Grazie per aver usato il programma");
			    	break;
				  
				default:
					System.out.println("Errore! Inserisci comando valido (0-1-2)");
					break;
		      }		  
				  
		   }while(scelta != 0);
	    }

}
