package sequenza;

public class Divisione2Interi 
{

	public static void main(String[] args) 
	{
		
		int a=12;
		int b=7;
		
		int q=a/b; // quoziente
		int r=a%b; // resto
		float qr= (float)a/b;  // casting
		
		System.out.println("Valore di a: "+ a);
		System.out.println("Valore di b: "+ b);
		System.out.println("Quoziente intero: "+ q);
		System.out.println("Resto: "+ r);
		System.out.println("Quoziente reale: "+ qr);

	}

}
