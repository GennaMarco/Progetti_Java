package array;

public class ArrayInteri 
{

	public static void main(String[] args) 
	{
		// array o vettori
		// dichiarazione di un array di interi
		
		int [] numeri = new int[5];  // dichiarazione di un array corretta
		
		// caricamento dati
		numeri[0] = 7;
		numeri[1] = -7;
		numeri[2] = 71;
		numeri[3] = -17;
		numeri[4] = 78;
		
		// lettura
		for(int i = 0; i<numeri.length; i++)
		{
			System.out.println("posizione: " + i +": valore: " + numeri[i]);
		}
		
		

	}

}
