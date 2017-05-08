package classi;

public class TestPunto {

	public static void main(String[] args) 
	{
		Punto p = new Punto("P", -3.4, 4.3);
		System.out.println(p);
		
		Punto q = new Punto(-13.4, 14.3);
		System.out.println(q);
		
		System.out.println("distanza tra Q e Q: " + q.distanza(q));
		System.out.println("distanza tra P e P: " + p.distanza(p));
		System.out.println("distanza tra P e 0: " + p.distanza());
		System.out.println("distanza tra P e Q: " + p.distanza(q));
		System.out.println("distanza tra Q e P: " + q.distanza(p));

	}

}
