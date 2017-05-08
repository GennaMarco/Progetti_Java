package classi;

public class TestRettangolo 
{

	public static void main(String[] args) 
	{
	   Rettangolo r = new Rettangolo(2,3);
	   
	   System.out.println("Dati del rettangolo N°1");
	   System.out.println(r);
	   System.out.println();
	   
	   r.setBase(6);
	   r.setAltezza(9);
	   
	   System.out.println("Dati del rettangolo N°1 modificato col setter");
	   System.out.println(r);
	   System.out.println();
	   
	   System.out.println("Dati del rettangolo N°1 con il separatore aggiunto");
	   System.out.println(r.stampa("; "));
	   System.out.println();
	   
	   Rettangolo r2 = new Rettangolo(0,5);
	   
	   System.out.println("Dati del rettangolo N°2 con almeno un parametro sbagliato");
	   System.out.println(r2);
	}

}
