package iterazione;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;                       // classe InputStreamReader

public class StampaMatriceTriangSuperiore 
{

	public static void main(String[] args) 
	{
		int n = 0;
		
		// input da tastiera
		InputStreamReader input = new InputStreamReader(System.in);     // mi da la possibilità di costruire degli oggetti: un tipo di dato, "new" mi da la possibilità di costruire oggetti
		BufferedReader tastiera = new BufferedReader(input);            // bufferizzo l'oggetto
		
		try
		{
		   System.out.print("Inserisci il numero di righe da stampare: ");
		   String tmp = tastiera.readLine();      // tmp è una stringa temporale "11"
		   n = Integer.parseInt(tmp);             // da "11" string a 11 int
		}
		catch(IOException e)
		{
		   System.out.println("Errore");
		}
		catch(Exception e)
		{
			System.out.println("Errore");
		}
		
		
		String msg="";

		for(int i = 0; i<n; i++)
		{
			msg ="";
			for(int j = 0; j<n; j++)
				msg = msg + (j<i ? " ": "*");
			System.out.println(msg);
		}

	}

}
