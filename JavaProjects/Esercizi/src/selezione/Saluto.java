package selezione;

public class Saluto 
{

	public static void main(String[] args) 
	{
		/*
		 * Saluto
		 * Buongiorno 6-14
		 * Buon pomeriggio 14-18
		 * Buona sera 18-22
		 * Buona notte 22-6
		 */
		int ora = 24;
		String msg = "";
		
		if(ora<0 || ora >23)
		{
			msg = "Errore";
		}
		else if(ora>=6 && ora<14)
		{
			msg = "Buongiorno";
		}
		else if(ora>=14 && ora<18)
		{
			msg = "Buon pomeriggio";
		}
		else if(ora>=18 && ora<22)
		{
			msg = "Buona sera";
		}
		else 
		{
			msg = "Buona notte";
		}
		System.out.println(msg);



	}

}
