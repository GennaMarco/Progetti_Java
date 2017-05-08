package compitiDadiEstrazioniNumeri;

public class NumeriCasualiInfSup 
{

	public static void main(String[] args) 
	{
		int dim, i;
		
		int inf = 1;
		int sup = 100;
		
		dim = MyLibrary.InfSupPositivi(inf, sup);
		int array[] = new int[dim];
		
		inf = -1000;
		sup = 1000;
		
		for(i = 0;i<array.length; i++)
		{
			array[i] = MyLibrary.casualeInfNegSupPos(inf, sup);
		}
		
		System.out.println("I numeri generati sono stati inseriti nel vettore: ");
		for(i = 0;i<array.length; i++)
		{
			System.out.println("Posizione (" + (i+1) + ")"+ " Numero: " + array[i]);
		}
		
		System.out.println("\nI multipli di 31 sono: ");
		for(i = 0;i<array.length; i++)
		{
			if(array[i] % 31 == 0)
			   System.out.println("Posizione (" + (i+1) + ")"+ " Numero: " + array[i]);
		}
	}

}
