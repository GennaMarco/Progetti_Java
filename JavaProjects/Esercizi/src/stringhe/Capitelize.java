package stringhe;

import java.util.Scanner;

public class Capitelize 
{
	public static void main(String[] args) 
	{
		// es. piNO => Pino
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Testo: ");
		String testo = tastiera.nextLine();
		tastiera.close();
		
		testo=("" + testo.charAt(0)).toUpperCase() + testo.substring(1).toLowerCase();          // il substring ha due overload, quello che usiamo noi indica da dove partire
		
		System.out.println("Capitalize: " + testo);

	}

}
