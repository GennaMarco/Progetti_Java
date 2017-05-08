package sequenza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Consulente 
{

	public static void main(String[] args) 
	{
		String nome="";
		double fatturato = 0;
		double spese = 0;
		
		InputStreamReader input = new InputStreamReader(System.in);     
		BufferedReader tastiera = new BufferedReader(input);
		try
		{
		   System.out.print("Inserisci il nome: ");
		   nome = tastiera.readLine();    
		   
		   System.out.print("Inserisci il fatturato: ");
		   String tmp = tastiera.readLine();
		   fatturato = Double.parseDouble(tmp);
		  
		   System.out.print("Inserisci la spesa: ");
		   tmp = tastiera.readLine();
		   spese = Double.parseDouble(tmp);
		   
		}
		catch(Exception e)
		{
			System.out.println("Errore");
			System.out.println(e.getMessage());
			
		}
		
		double guadagno = fatturato - spese;
		
		String msg = "Dati del consulente: "
				+ "\nNominativo: " + nome
				+ "\nFatturato: " + fatturato + "€"
				+ "\nSpese: " + spese + "€"
				+ "\nGuadagno: " + guadagno + "€"
				;
		
		System.out.println(msg);
		
		
	}

}
