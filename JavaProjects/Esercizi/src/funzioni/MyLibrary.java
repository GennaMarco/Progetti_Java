package funzioni;

public class MyLibrary 
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
	
	public static int casualeInfSup(int inf, int sup)
	{
		return (int)(Math.random()*(sup-inf+1) + inf); 
	}
	
	public static int estrazione()
	{
		return (int)(Math.random() * 90 + 1);
	}
}
