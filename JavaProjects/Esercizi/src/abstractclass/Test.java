package abstractclass;

public class Test {

	public static void main(String[] args) 
	{
	    //Solido s = new Solido(7.85); <-- ERRORE
		Solido s;
		
		//Tabella di riferimento per pesi specifici: http://www.oppo.it/tabelle/pesi_specifici.html
		
		Materiale benzina = new Materiale("Benzina", 0.70);
		Materiale marmo = new Materiale("Marmo", 2.50);
		
		Cubo c1 = new Cubo(benzina, 2.5);
	    System.out.println(c1);
		
	    Cubo c2 = new Cubo(marmo, 2.5);
		System.out.println(c2);
		
		Sfera s1 = new Sfera(marmo, 0);
		System.out.println(s1);
		
		Cubo c3 = new Cubo(benzina, 5.5);
		System.out.println(c3);
		
		PiramideRettaBaseEsagonale p1 = new PiramideRettaBaseEsagonale(benzina, 4, 6);
		System.out.println(p1);
		
		PiramideRettaBaseEsagonale p2 = new PiramideRettaBaseEsagonale(marmo, 4, 6);
		System.out.println(p2);

	}
}
