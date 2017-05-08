package stringhe;

import java.util.Random;
import java.util.Scanner;

public class GeneraPasswordCasuale {

	public static void main(String[] args) 
	{
		String number ="0123456789";
		String lettere ="abcdefghijklmnopqrstuvwxyz";
		
		String speciali="$&@#+-!_";
		String pattern = lettere + lettere.toUpperCase() + number + speciali;
		
		System.out.println(pattern);
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Lunghezza della password: ");
		int n = tastiera.nextInt();
		tastiera.close();
		
		String pw="";
		for(int i = 0;i<n;i++)
		{
	       Random r = new Random();
	       pw += pattern.charAt(r.nextInt(pattern.length()));
		}
		
		System.out.println("Password generata: " + pw);

	}

}
