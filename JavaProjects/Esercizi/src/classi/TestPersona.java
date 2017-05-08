package classi;

import enumeration.Sesso;

public class TestPersona 
{

	public static void main(String[] args) 
	{
		Persona pino = new Persona();
		pino.setNome("Pino");
		pino.setCognome("Caluso");
		System.out.println(pino);
		
		Persona dino = new Persona("Dino", "Delillo");
		System.out.println(dino);
		
		
		Data dNascitaMino = new Data(23, 4, 1993);
		Persona mino = new Persona("Mino", "Raspino", dNascitaMino, "Loreto", Sesso.MASCHIO);
		System.out.println(mino);
	 }

}
