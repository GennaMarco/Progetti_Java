package selezione;

public class SequenzaOraria 
{

	public static void main(String[] args) 
	{
		int ore = 23;
		int minuti = 23;
		int secondi = 40;
		
		String msg = "";
		
		if(ore<0 || ore >23 || minuti<0 || minuti>59 || secondi<0 || secondi >59)
		{
			msg = "Errore";
		}
		else
		{
			/*
			if(ore<10)
				msg = msg +"0";
			    msg = msg + ore +":";
			if(minuti<10)
			   msg = msg +"0";
			   msg = msg + minuti +":";
			if(secondi<10)
			   msg = msg +"0";
			   msg = msg + secondi +":";
			*/
			   
			// versione migliorata ? :
			msg = msg + (ore<10 ? "0":"") + ore + ":";
			msg = msg + (minuti<10 ? "0":"") + minuti + ":";
			msg = msg + (secondi<10 ? "0":"") + secondi;
		 }
		 System.out.println(msg);
	}

}
