package compitiDadiEstrazioniNumeri;

public class MyLibrary 
{
	
	public static int lancioDado()
	{
		return lancioDado(6);
	}
		
	public static int lancioDado(int numFaccie)     
	{
		return (int)(Math.random()*numFaccie+1);
	}
	
	public static int casualeInfNegSupPos(int inf, int sup)
	{
		return (int)(((Math.random() * (sup+1)) + (Math.random() * (inf-1)))); 
	}
	
	public static int estrazioneLotto()
	{
		return (int)(Math.random() * 90 + 1);
	}
	
	public static int InfSupPositivi(int inf, int sup)
	{
		return (int)(Math.random()*(sup-inf+1) + inf); 
	}
}
