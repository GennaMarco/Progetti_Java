package gestionale;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestProdotto 
{

	public static void main(String[] args) 
	{
		int scelta, quantita;
	 
		Prodotto p = new Prodotto("Carne", "123", "nuovo", 23);
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
	    do{
	    	 
		     System.out.println("\nMENU");
	         System.out.println("1 --> Ordina prodotto");
		     System.out.println("0 --> Esci dal programma");
		     System.out.println(p);
		     System.out.print("Inserisci comando: ");
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
		        case 1: if(p.getGiacenza() > 0)
		        		{
		        		   System.out.print("Inserisci quantita: ");
		        		   try
		        		   {
		                      quantita = Integer.parseInt(tastiera.readLine());
		                      p.OrdinaProdotto(quantita);
		                   }
		        		   catch(Exception e)
		        		   {
		        			  System.out.println("Errore! inserire numeri interi");
		        		   }
		                }
		        		else
		        		   System.out.println("Non puoi ordinare, Prodotto esaurito");
		        		break;
		           
		        case 0: System.out.println("Programma terminato");
		                break;
		      
		        default:System.out.println("Inserisci comando valido");
		                
		                break;        
		     }
		 
	 }while(scelta != 0);
	    
     

	}

}
