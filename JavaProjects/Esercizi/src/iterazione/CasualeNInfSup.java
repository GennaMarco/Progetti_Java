package iterazione;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CasualeNInfSup 
{

	public static void main(String[] args) 
	{
		// generatore di un numero casuale in un intervallo di valori noti
		// SOLO NUMERI POSITIVI
		
		int inf = 0;
		int sup = 0;
		int n = 0;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);

		
		boolean flag = false; // non ci sono errori
		do
		{
		   flag = false;
		   try
		   {
			  System.out.print("Quanti valori devo generare? ");
			  n = Integer.parseInt(tastiera.readLine()); 
			   
		      System.out.print("Estremo inferiore: ");
		      inf = Integer.parseInt(tastiera.readLine());
		      
		      System.out.print("Estremo superiore: ");
		      sup = Integer.parseInt(tastiera.readLine());
		   }
		   catch(Exception e)
		   {
			  System.out.println("\nErrore"); 
			  //e.printStackTrace();
			  // System.exit(0);              // terminazione del programma (NECESSARIO)
			  flag = true;                // si è verificato un errore
			
		   }
		  
		   
		 }while(flag);
		
		// casuale intero [1-10]
		/*double c1 = Math.random();   // random genera un numero da 
		double c2 = c1 * sup;
		double c3 = c2 + inf;
		int c4 = (int)c3;
		*/
		int c = 0;
		
			
		for(int i = 0; i < n; i ++)
		{
			
			  c = (int)(Math.random()*(sup-inf+1) + inf); 
			  System.out.println("valore generato: " + c);
		}
		
		
		
		
	}

}
