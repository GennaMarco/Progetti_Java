package compitiIterazione;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Consulenze 
{

	public static void main(String[] args) 
	{
		int Nconsulenti = 0;
		int i = 0;
		double fatturato = 0;
		double spese = 0;
		double guadagno = 0;
		double Fmax = 0;
		double Smin = 0;
		double Gmax = 0;
		String NomeFmax = "";
		String NomeSmin = "";
		String NomeGmax = "";
		String nome = "";
		String tmp = "";
		
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		try
		{
			System.out.print("Inserisci quanti consulenti vuoi inserire: ");
			tmp = tastiera.readLine();
			Nconsulenti = Integer.parseInt(tmp);
			
			while(Nconsulenti<=0)
			{
			  System.out.print("Inserisci numero > 0: ");
			  tmp = tastiera.readLine();
			  Nconsulenti = Integer.parseInt(tmp);
			}
			System.out.println();
			
			if(Nconsulenti>0)
			{
			   System.out.println("Inserisci dati consulente " + (i+1) + ": ");
			   System.out.print("Nome: ");
			   NomeFmax = tastiera.readLine();
			   NomeSmin = NomeFmax;
			   NomeGmax = NomeSmin;
			
			   System.out.print("Fatturato: €");
			   tmp = tastiera.readLine();
			   Fmax = Double.parseDouble(tmp);
			
			   System.out.print("Spese: €");
			   tmp = tastiera.readLine();
			   Smin = Double.parseDouble(tmp);
			   
			   Gmax = Fmax - Smin;
			}
			System.out.println();
			
			for(i = 1; i<Nconsulenti; i++)
			{
			    System.out.println("Inserisci dati consulente " + (i+1) + ": ");
				
				System.out.print("Nome: ");
				nome = tastiera.readLine();
				
				System.out.print("Fatturato: €");
				tmp = tastiera.readLine();
				fatturato = Double.parseDouble(tmp);
				
				System.out.print("Spese: €");
				tmp = tastiera.readLine();
				spese = Double.parseDouble(tmp);
				
				guadagno = fatturato - spese;
				
				if(fatturato>Fmax)
				{
					Fmax = fatturato;
					NomeFmax = nome;
				}
				if(spese<Smin)
				{
					Smin = spese;
					NomeSmin = nome;
			 	}
				if(guadagno>Gmax)
				{
					Gmax = guadagno;
					NomeGmax = nome;
				}
				System.out.println();
		    }
			System.out.println("Nome cliente fatturato maggiore: " + NomeFmax);
			System.out.println("Nome cliente spese minori: " + NomeSmin);
			System.out.println("Nome cliente guadagno maggiore: " + NomeGmax);
		}
		catch(Exception e)
		{
		   System.out.println("Errore");
		   System.out.println(e.getMessage()); 
		}
		
	}

}
