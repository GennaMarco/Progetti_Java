package iterazione;

public class QuadratoSommaNDispari 
{

	public static void main(String[] args) 
	{
		//output: 121=1+3+5+7+9+11+13+15+17+19+21=11^2 
		
		int n = 11;
		int somma = 0;
		int i = 0;
		String msg = "";
		String txt = "";
		
		for(i = 0;i < n; i++)
		{
			txt = txt + (i != 0 ? " + " : "") + (i * 2 + 1);
		    somma = somma + i * 2 + 1;
		}
	
		msg = somma + " = " + txt + " = " + n + "^2";
		System.out.println(msg);
		
    }

}