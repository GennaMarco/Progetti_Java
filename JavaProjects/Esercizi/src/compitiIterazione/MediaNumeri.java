package compitiIterazione;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MediaNumeri 
{

	public static void main(String[] args) 
	{
		int Numeri = 0;
		int i = 0;
		double n = 0;
		double somma = 0;
		double media = 0;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		try
		{
			System.out.print("Inserisci tra quanti numeri vuoi calcolare la media: ");
			String tmp = tastiera.readLine();
			Numeri = Integer.parseInt(tmp);
			
			for(i = 0; i<Numeri; i++)
			{
				System.out.print("Numero "+ (i+1) + ": ");
				tmp = tastiera.readLine();
				n = Double.parseDouble(tmp);
				somma = somma + n;
			}
			media = somma / i;
			System.out.print("Media: " + media);
			
		}
		catch(Exception e)
		{
		   System.out.println("Errore");
		   System.out.println(e.getMessage());
		}
		
		
	}

}
