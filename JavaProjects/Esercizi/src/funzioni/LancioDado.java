package funzioni;

public class LancioDado 
{
	// METODO STATICO
	public static int lancioDado()
	{
		return lancioDado(6);
	}
	
	// GENERALIZZAZIONE  sto eseguendo l'overloading su lancioDado()   l'overloading è implementare lo stesso metodo ma con parametri diversi
	public static int lancioDado(int numFaccie)     // la firma del metodo è data dall'identificatore del metodo più i suoi parametri
	{
		return (int)(Math.random()*numFaccie+1);
	}
	

	public static void main(String[] args) 
	{
		// lancio del dado a 6 faccie
		
		int dado = 0;
		int dado17 = 0;
		int dadoN = 0;
		int n = 2;
		
		for(int i = 0;i < n; i++)
		{
			dado = lancioDado();
			System.out.println("Valore estratto: " + dado);
			dado17 = lancioDado(17);
			System.out.println("Valore estratto (17): " + dado17);
			dadoN = lancioDado(54);
			System.out.println("Valore estratto (54): " + dadoN);
		}
		

	}

}
