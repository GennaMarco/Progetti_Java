package matrici;

import funzioni.MyLibrary;

public class MatriceMultiDimensionale 
{
	public static int casuale(int inf, int sup)
	{
	   return (int)(Math.random()*(sup-inf+1)+inf);	
	}

	public static void main(String[] args) 
	{
		// definizione
		int[][] matrice = new int[MyLibrary.casualeInfSup(1, 10)][];
		
		
		//caricamento dati
		for(int i = 0; i< matrice.length; i++)
		{
			matrice[i] = new int[casuale(1, 10)];
			for(int j = 0; j < matrice[i].length; j++)
			{
				matrice[i][j] = MyLibrary.casualeInfSup(-10, 10);
			}
			
		}
		
		// stampa della matrice
		for(int i = 0; i< matrice.length; i++)
		{
			for(int j = 0; j < matrice[i].length; j++)
			{
			   System.out.print("\t" + matrice[i][j]);
			}
			System.out.println();
		}	
		
    }

}
