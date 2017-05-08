package classi;


// NOTA BENE: qualsiasi classe si va a costruire � sempre un oggetto
public class Triangolo 
{
	// attributi
	private double lato1;
	private double lato2;
	private double lato3;
	
	public Triangolo(){}
	
	public Triangolo(double lato1, double lato2, double lato3)
	{
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	
	public Triangolo(Punto punto1, Punto punto2, Punto punto3)
	{
		this.lato1 = punto1.distanza(punto2);
		this.lato2 = punto2.distanza(punto3);
		this.lato3 = punto3.distanza(punto1);
	}
	
	
	// metodi
	private boolean isCostruibile()
	{
		return lato1+lato2>lato3 &&
			   lato2+lato3>lato1 &&
			   lato1+lato3>lato2;
	}
	
	public double perimetro()
	{
		return lato1+lato2+lato3;
	}
	
	public double area()
	{
		// formula di erone
		double sp = perimetro()/2;
		return Math.sqrt(sp*(sp-lato1)*(sp-lato2)*(sp-lato3));
	}

	public String tipo()
	{
		if(lato1==lato2 && lato1==lato3)
			return "Equilatero";
		else if(lato1==lato2 || lato1==lato3 || lato2==lato3)
			return "Isoscele";
		else
			return "Scaleno";
	}
	
	
	public String stampa()
	{
		return stampa(", ");
	}
	
	public String stampa(String separatore)
	{
		if(!isCostruibile())
			return "Dati Inseriti non validi ai fini della costruzione di un triangolo";
		
		return ""  // servono per iniziare una stringa vuota
				+ "Lato1: " + lato1
				+ separatore
				+ "Lato2: " + lato2
				+ separatore
				+ "Lato3: " + lato3
				+ separatore
				+ "Perimetro: " + perimetro()
				+ separatore
				+ "Area: " + area()
				+ separatore
				+ "Tipo: " + tipo()
				;
	}
	
	@Override  // necessario per rilevare un metodo gia esistente della classe System.Object; NON SI PUO' PARAMETRIZZARE
	public String toString()
	{
	   return stampa();	
	}
	
}
