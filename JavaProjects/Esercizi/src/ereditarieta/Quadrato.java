package ereditarieta;

public class Quadrato extends Rettangolo 
{

	public Quadrato(double lato) 
	{
		super(lato, lato);
	}

	@Override
	public String toString() {
		return 
				"Quadrato "
				+ "[Lato=" + getLato1() 
				+ ", perimetro=" + perimetro() 
				+ ", area=" + area()
				+ ", diagonale=" + diagonale() 
				+ "]"
				;
	}
    
	
}
