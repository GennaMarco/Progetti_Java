package matrici;

public class MatriceInteri 
{

	public static void main(String[] args) 
	{
		// matrice rettangolare 3x2 di numeri interi
		
		int righe = 3;   // numero di righe
		int colonne = 2; // numero di colonne
		
		// dichiarazione di una matrice
		int[][] matrice = new int [righe][colonne];
		
		//caricamento della matrice
		matrice[0][0] = 12;
		matrice[0][1] = -12;
		matrice[1][0] = 11;
		matrice[1][1] = -11;
		matrice[2][0] = 10;
		matrice[2][1] = -10;
		
		//stampa della matrice
		for(int i = 0; i < matrice.length; i++)
		{
			for(int j = 0; j < matrice[i].length; j++)
			{
				System.out.print("\t" + matrice[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
