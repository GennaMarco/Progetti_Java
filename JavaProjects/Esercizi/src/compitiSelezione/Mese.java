package compitiSelezione;

public class Mese 
{

	public static void main(String[] args) 
	{
		int n = 2;       // input
		String msg = ""; // output
		
		if(n<1 || n>12)
			msg ="Errore";
		else
		{
		   if(n == 1)
			  msg = "Gennaio";
		   else if(n == 2)
			  msg = "Febbraio";
		   else if(n == 3)
			  msg = "Marzo";
		   else if(n == 4)
			  msg = "Aprile";
		   else if(n == 5)
		 	  msg = "Maggio";
		   else if(n == 6)
			  msg = "Giugno";
		   else if(n == 7)
			  msg = "Luglio";
		   else if(n == 8)
			  msg = "Agosto";
		   else if(n == 9)
			  msg = "Settembre";
		   else if(n == 10)
			  msg = "Ottobre";
		   else if(n == 11)
			  msg = "Novembre";
		   else if(n == 12)
			  msg = "Dicembre";
		  
		   msg = "Mese: " + msg;
		}
		
		System.out.println(msg);    

	}

}
