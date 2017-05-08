package iterazione;

public class StampaMatriceTriang 
{

	public static void main(String[] args) 
	{
		int n = 5;
		int i = 0;
		int j = 0;
		
		
		for(i = 0; i < n; i++)
		{
		   for(j = 0; j < i; j++)
			   System.out.print("*");
		   
		   System.out.println("*");
		}
		
		
	/*	
	 *  String matrice = "";
		String ast = "*";
		
		while(i<n)
		{
			matrice = matrice + ast +"\n";
			ast = ast + " *";
			i++;
		}
		
		
		
		
		
		System.out.println(matrice);
		*/
     
	
		

	}

}
