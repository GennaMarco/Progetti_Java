package compitiSelezione;

public class Settimana 
{

	public static void main(String[] args) 
	{
		// Dato in input un numero intero,
		// stampare il nome del giorno della settimana
		
		int n = 3;       // input
		String msg = ""; // output
		// selezione multipla
		switch(n)
		{
		   case 1: msg = "Lunedi";
		   break;
		   case 2: msg = "Martedi";
		   break;
		   case 3: msg = "Mercoledi";
		   break;
		   case 4: msg = "Giovedi";
		   break;
		   case 5: msg = "Venerdi";
		   break;
		   case 6: msg = "Sabato";
		   break;
		   case 7: msg = "Domenica";
		   break;
		   default : msg = "Errore";
		}
		
	/*  Equivale alle istruzioni qui sotto
	 
	
		if(n<1 || n>7)
			msg ="Errore";
		else
		{
		   if(n == 1)
			  msg = "Lunedi";
		   else if(n == 2)
			  msg = "Martedi";
		   else if(n == 3)
			  msg = "Mercoledi";
		   else if(n == 4)
			  msg = "Giovedi";
		   else if(n == 5)
			  msg = "Venderdi";
		   else if(n == 6)
			  msg = "Sabato";
		   else if(n == 7)
			  msg = "Domenica";
		  
		   msg = "Giorno: " + msg;
		} 
	*/
		
		System.out.println("Numero: " + n + "; Nome del giorno della settimana: " + msg);    
		

	}

}
