package stringhe;

import java.util.Scanner;

public class CapitalizeAllWords 
{
        public static String capitalize(String testo)
	    {
	    	return ("" + testo.charAt(0)).toUpperCase() + testo.substring(1).toLowerCase(); // il substring ha due overload, quello che usiamo noi indica da dove partire
	    }
		
		public static void main(String[] args) 
		{
			// es. piNO => Pino
			
			Scanner tastiera = new Scanner(System.in);
			
			System.out.println("Testo: ");
			String testo = tastiera.nextLine();
			tastiera.close();
			
			String[] parole = testo.split(" ");               // split permette di ut
			
			for(int i = 0; i<parole.length; i++)
			{
				parole[i] = capitalize(parole[i]);
			}
			String join = String.join(" ", parole);
			
			System.out.println("Capitalize: " + join);

		}

}
