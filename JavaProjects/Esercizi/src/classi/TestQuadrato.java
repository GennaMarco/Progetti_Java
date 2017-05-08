package classi;

public class TestQuadrato 
{

	public static void main(String[] args) 
	{
		Quadrato q = new Quadrato(12.72);    // istanzio l'oggetto della classe Quadrato
		
		//System.out.println("Lato: " + q.lato);
		//System.out.println("Perimetro: " + q.perimetro());
		//System.out.println("Area: " + q.area());
		//System.out.println("Diagonale: " + q.diagonale());
		System.out.println("Dati del quadrato: \n"+ q.stampa());
		System.out.println();
		
	}

}
