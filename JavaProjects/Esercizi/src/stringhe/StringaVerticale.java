package stringhe;

import java.util.Scanner;

public class StringaVerticale {

	public static void main(String[] args) 
	{
	   Scanner tastiera = new Scanner (System.in);
	   System.out.println("Inserisci un testo");
	   String tmp = tastiera.nextLine();
	   tastiera.close();
	   
	   for(int i = 0; i<tmp.length(); i++)
		   System.out.println(tmp.charAt(i));      // charAt lo sai cosa fa, l'hai usato nella biblioteca
	   
	   for(int i = 0; i<tmp.length(); i++)
		   System.out.println(tmp.substring(i, i+1));  // si utilizza per tirare fuori porzioni di stringhe
	}

}
