package iterazione;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fattoriale 
{

	public static void main(String[] args) 
	{
		//fattoriale di n
		/*
		 
		 n != n*(n-1)*(n-2)*...   2*1         >// != --> indica il fattoriale (non DIVERSO)	
		 
		 eccezioni
		 n == 0 oppure n ==1
		 n!= 1
		  
		  
		 */
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		int n = 0;
		boolean flag = false; // non ci sono errori
		do
		{
		   flag = false;
		   try
		   {
		      System.out.print("Inserisci un numero naturale: ");
		      n = Integer.parseInt(tastiera.readLine());
		   }
		   catch(Exception e)
		   {
			  System.out.println("\nErrore"); 
			  //e.printStackTrace();
			  // System.exit(0);              // terminazione del programma (NECESSARIO)
			  flag = true;                // si è verificato un errore
			
		   }
		   if(n<0)
		   {
			  System.out.println("Solo numeri positivi");
		      flag = true;
		   }
		   
		 }while(flag);   
		
		 int fatt = 1;
		
		 for(int i = 2; i<=n ; i++)
		 {
		    fatt = fatt * i;
		 }
		 System.out.println(n + "!=" + fatt);

	}

}
