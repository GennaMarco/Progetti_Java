package classi;

public class TestCerchio 
{

	public static void main(String[] args) 
	{

	   Cerchio c = new Cerchio(12);
		
	   System.out.println("Dati del Cerchio: \n"+ c.stampa());
		
	   c.setRaggio(23);
		
	   System.out.println("Dati del Cerchio: \n"+ c.stampa());
		
		
	}

}
